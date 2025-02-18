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
    private String Descricao;
    @Column(nullable = true)
    private LocalDate dataPublicacao;
    @Column(nullable = true)
    private LocalDate dataExposicao;

}
