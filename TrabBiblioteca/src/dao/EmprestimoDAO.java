/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Emprestimo;
import beans.Exemplar;
import beans.Usuario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author a1feu
 */
public class EmprestimoDAO {
    private Conexao conexao;
    private Connection conn;
    
    public EmprestimoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public int encontraIsbn(int idExemplar){
        String sql = "SELECT isbn FROM exemplares WHERE idexemplares = ?";
        int isbn = 0;
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, idExemplar);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                isbn = rs.getInt("isbn");
            }
            
            return isbn;
        } catch (Exception e){
            System.out.println("Não foi possível diminuir o número de exemplares disponíveis. "+e.getMessage());
            return 0;
        }        
    }
    
    public void diminuirNumeroDeExemplares(int isbn){
        String sql = "UPDATE livros SET numeroexemplares=numeroexemplares-1 WHERE id = ? AND numeroexemplares > 0";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, isbn);
            stmt.execute();
        } catch (Exception e){
            System.out.println("Não foi possivel aumentar o número de livros. "+e.getMessage());
        }
    }
    
    public void aumentarNumeroDeExemplares(int isbn){
        String sql = "UPDATE livros SET numeroexemplares = numeroexemplares + 1 WHERE id = ?";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, isbn);
            stmt.execute();
        } catch (Exception e){
            System.out.println("Não foi possivel diminuir o número de livros. "+e.getMessage());
        }
    }
    
    private void mudaEstadoExemplar(int idExemplar, String processo){
        String sql = "UPDATE exemplares SET estado = ? WHERE idexemplares = ?";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            if(processo.equals("Emprestimo")){
                stmt.setString(1, "Indisponível");
            } else {
                stmt.setString(1, "Disponível");
            }
            stmt.setInt(2, idExemplar);
            
            stmt.execute();
        } catch (Exception e){
            System.out.println("impossível mudar o estado do exemplar. " + e.getMessage());
        }
    }
    
    public void fazerEmprestimo(Usuario user, int idExemplar){
        String sql = "INSERT INTO emprestimo(matricula, dataEmprestimo, dataDevolucao, estado, idUsuario, idExemplar) values (?,?,?,?,?,?)";
        Exemplar exemplar = new Exemplar();
        Emprestimo emp = new Emprestimo();
        int isbn = encontraIsbn(idExemplar);
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, user.getMatricula());
            stmt.setString(2, emp.getDataEmprestimo().toString());
            stmt.setString(3, emp.getDataDevolucao().toString());
            stmt.setString(4, "Emprestado");
            stmt.setInt(5, user.getIdUsuario());
            stmt.setInt(6, idExemplar);
            
            stmt.execute();
            
            this.mudaEstadoExemplar(idExemplar, "Emprestimo");
            diminuirNumeroDeExemplares(isbn);
        } catch (Exception e){
            System.out.println("Erro ao fazer emprestimo. " + e.getMessage());
        }
        
        
    }
    
    private int procuraEmprestimo(int idExemplar){
        String sql = "SELECT idemprestimo FROM emprestimo WHERE idexemplar = ?";
        int idEmp = 0;
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, idExemplar);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                idEmp = rs.getInt("idEmprestimo");
            }
            return idEmp;
        } catch (Exception e){
            System.out.println("Exemplar não encontrado. "+e.getMessage());
            return 0;
        }
    }
    
    public void fazerDevolucao(Usuario user, int idExemplar){
        int idEmprestimo = this.procuraEmprestimo(idExemplar);
        
        int isbn = encontraIsbn(idExemplar);
        
        String sql = "UPDATE emprestimo SET estado = ? WHERE idemprestimo = ? AND matricula = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "Devolvido");
            stmt.setInt(2, idEmprestimo);
            stmt.setString(3, user.getMatricula());
            stmt.execute();
            
            this.mudaEstadoExemplar(idExemplar, "Devolucao");
            aumentarNumeroDeExemplares(isbn);
        } catch (Exception e){
            System.out.println("Não foi possível fazer a devolução. "+e.getMessage());
        }
    }
    
    
}
