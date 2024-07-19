/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Exemplar;
import beans.Livro;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ExemplarDAO {
    private Conexao conexao;
    private Connection conn;
    
    public ExemplarDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void cadastrarExemplar(Livro livro, Exemplar exemplar){
        String sql = "INSERT INTO exemplares(titulo, autor, estado, isbn) VALUES (?,?,?,?)";
        try{
         int count = livro.getNumeroExemplares();
            while(count != 0){
                PreparedStatement stmt2 = this.conn.prepareStatement(sql);
                stmt2.setString(1, exemplar.getTitulo().getTitulo());
                stmt2.setString(2, exemplar.getAutor().getAutor());
                stmt2.setString(3, exemplar.getEstado());
                stmt2.setInt(4, exemplar.getIsbn().getId());
                stmt2.execute();
                count -= 1;
            }
        }
        catch (SQLException e){
            System.out.println("Erro ao cadastrar exemplar: "+e.getMessage());
        }
    }
    
    
    
    public List<Exemplar> getExemplares(String titulo){
        String sql = "SELECT * FROM exemplares WHERE estado=? AND titulo LIKE ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "Disponível");
            stmt.setString(2, titulo+"%");
            ResultSet rs = stmt.executeQuery();
            List<Exemplar> listaExemplares = new ArrayList<>();
            while (rs.next()){
                Exemplar exemplar = new Exemplar();
                exemplar.setIdexemplares(rs.getInt("idexemplares"));
                Livro livroTitulo = new Livro();
                livroTitulo.setTitulo(rs.getString("titulo"));
                exemplar.setTitulo(livroTitulo);
                Livro livroAutor = new Livro();
                livroAutor.setAutor(rs.getString("autor"));
                exemplar.setAutor(livroAutor);
                Livro livroId = new Livro();
                livroId.setId(rs.getInt("isbn"));
                exemplar.setIsbn(livroId);
                listaExemplares.add(exemplar);
            }
            return listaExemplares;
        }
        catch (SQLException e){
            System.out.println("Erro ao listar exemplares: "+e.getMessage());
            return null;
        }
    }
    
    
    
    public void excluirExemplar(String titulo){
        String sql = "DELETE FROM exemplares WHERE titulo=?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, titulo);
            stmt.execute();
        }
        catch (SQLException e){
            System.out.println("Error ao remover exemplar: "+ e.getMessage());
        }
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
    
    public void mudaEstadoExemplar(int idExemplar, String processo){
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
    
}