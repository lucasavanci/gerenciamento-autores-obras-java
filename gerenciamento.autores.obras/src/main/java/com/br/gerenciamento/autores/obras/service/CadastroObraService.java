package com.br.gerenciamento.autores.obras.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.gerenciamento.autores.obras.Repository.ObraRepository;
import com.br.gerenciamento.autores.obras.mapper.ObraMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class CadastroObraService {

    @Autowired
    private final ObraRepository obraRepository;
    private final ObraMapper obraMapper;

    
    
}
