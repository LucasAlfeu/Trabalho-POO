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
import dao.ExemplarDAO;

/**
 *
 * @author a1feu
 */
public class EmprestimoDAO {
    private Conexao conexao;
    private Connection conn;
    private ExemplarDAO metodosExemplarDAO;
    private LivroDAO metodosLivroDAO;
    
    public EmprestimoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    
    
    
    
    public boolean fazerEmprestimo(Usuario user, int idExemplar){
        String sql = "INSERT INTO emprestimo(matricula, dataEmprestimo, dataDevolucao, estado, idUsuario, idExemplar) values (?,?,?,?,?,?)";
        Exemplar exemplar = new Exemplar();
        Emprestimo emp = new Emprestimo();
        int isbn = metodosExemplarDAO.encontraIsbn(idExemplar);
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, user.getMatricula());
            stmt.setString(2, emp.getDataEmprestimo().toString());
            stmt.setString(3, emp.getDataDevolucao().toString());
            stmt.setString(4, "Emprestado");
            stmt.setInt(5, user.getIdUsuario());
            stmt.setInt(6, idExemplar);
            
            stmt.execute();
            
            this.metodosExemplarDAO.mudaEstadoExemplar(idExemplar, "Emprestimo");
            this.metodosLivroDAO.diminuirNumeroDeExemplares(isbn);
            return true;
        } catch (Exception e){
            System.out.println("Erro ao fazer emprestimo. " + e.getMessage());
            return false;
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
    
    public boolean fazerDevolucao(Usuario user, int idExemplar){
        int idEmprestimo = this.procuraEmprestimo(idExemplar);
        
        int isbn = this.metodosExemplarDAO.encontraIsbn(idExemplar);
        
        String sql = "UPDATE emprestimo SET estado = ? WHERE idemprestimo = ? AND matricula = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "Devolvido");
            stmt.setInt(2, idEmprestimo);
            stmt.setString(3, user.getMatricula());
            stmt.execute();
            
            this.metodosExemplarDAO.mudaEstadoExemplar(idExemplar, "Devolucao");
            this.metodosLivroDAO.aumentarNumeroDeExemplares(isbn);
            return true;
        } catch (Exception e){
            System.out.println("Não foi possível fazer a devolução. "+e.getMessage());
            return false;
        }
    }
    
    
}
