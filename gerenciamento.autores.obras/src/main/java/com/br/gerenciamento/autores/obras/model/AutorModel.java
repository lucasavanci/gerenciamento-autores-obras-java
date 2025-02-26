package com.br.gerenciamento.autores.obras.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "autores")
public class AutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutor;

    @Column(nullable = false)
    private String nomeAutor;
    private String sexo;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(nullable = false)
    private String pais;
    @Column(unique = false)
    private String cpf;

    public Long getIdAutor(){
        return idAutor;
    }

    public void setIdAutor(Long idAutor){
        this.idAutor = idAutor;
    }

    public String getNomeAutor(){
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor){
        this.nomeAutor = nomeAutor;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

}
