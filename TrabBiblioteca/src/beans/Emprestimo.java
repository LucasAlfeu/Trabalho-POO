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
    private String dataEmprestimoAux;
    private LocalDate dataDevolucao;
    private String dataDevolucaoAux;
    private String matricula;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataEmprestimoAux() {
        return dataEmprestimoAux;
    }

    public void setDataEmprestimoAux(String dataEmprestimoAux) {
        this.dataEmprestimoAux = dataEmprestimoAux;
    }

    public String getDataDevolucaoAux() {
        return dataDevolucaoAux;
    }

    public void setDataDevolucaoAux(String dataDevolucaoAux) {
        this.dataDevolucaoAux = dataDevolucaoAux;
    }
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
