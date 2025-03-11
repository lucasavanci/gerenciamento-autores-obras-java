package com.br.gerenciamento.autores.obras.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "obras")
public class ObraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObra;

    @Column(nullable = false)
    private String nomeObra;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = true)
    private LocalDate dataPublicacao;
    @Column(nullable = true)
    private LocalDate dataExposicao;

    public Long getIdObra(){
        return idObra;
    }

    public void setIdObra(Long idObra){
        this.idObra = idObra;
    }

    public String getNomeObra(){
        return nomeObra;
    }

    public void setNomeObra(String nomeObra){
        this.nomeObra = nomeObra;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public LocalDate getDataPublicacao(){
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao){
        this.dataPublicacao = dataPublicacao;
    }

    public LocalDate getDataExposicao(){
        return dataExposicao;
    }

    public void setDataExposicao(LocalDate dataExposicao){
        this.dataExposicao = dataExposicao;
    }

}
