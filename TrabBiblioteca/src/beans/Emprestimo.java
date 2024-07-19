/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

/**
 * !!!!! ATENÇÃO !!!!!!
 * Foi necessário fazer mudanças no banco de dados
 * 
 * @author Usuario
 */
public class Emprestimo {
    private int idEmprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private List<Exemplar> lista = new ArrayList<>();
    private Exemplar idExemplar;
    private Usuario idUsuario;
    
    public static final String DATE_FORMAT_NOW = "dd-MM-yyyy";
    
    public Emprestimo(){
        LocalDate hoje = LocalDate.now();
        this.dataEmprestimo = hoje;
        this.dataDevolucao = hoje.plusDays(30);
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Exemplar getIdExemplar() {
        return idExemplar;
    }

    public void setIdExemplar(Exemplar idExemplar) {
        this.idExemplar = idExemplar;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public List<Exemplar> getLista() {
        return lista;
    }

    public LocalDate getDataEmprestimo() {
        
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    

    public void setLista(List<Exemplar> lista) {
        this.lista = lista;
    }
    
    
}
