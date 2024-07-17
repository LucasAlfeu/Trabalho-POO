/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Espera;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jjooa
 */
public class ListaEsperaDAO {

    private Conexao conexao;
    private Connection conn;

    public ListaEsperaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void adicionarLivroNaLista(Espera le) {
        String sql = "INSERT INTO listaespera(titulo,isbn,usuario) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, le.getTitulo());
            stmt.setInt(2, le.getIsbn());
            stmt.setInt(3, le.getUsuario());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar livro na lista de espera.");
        }
     
    }
    public List<Espera> getListaEspera(String titulo){
        String sql = "SELECT * FROM listaespera WHERE titulo LIKE ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Espera> listaLivroEspera = new ArrayList<>();
            while(rs.next()){
                Espera e = new Espera();
                e.setTitulo(rs.getString("listaEspera"));
                e.setIsbn(rs.getInt("isbn"));
                e.setUsuario(rs.getInt("Usuario"));
                listaLivroEspera.add(e);
            }
            return listaLivroEspera;
        } catch(SQLException e){
            System.out.println("Erro ao obter lista de espera: "+ e.getMessage());
            return null;
        }
    } 
}
