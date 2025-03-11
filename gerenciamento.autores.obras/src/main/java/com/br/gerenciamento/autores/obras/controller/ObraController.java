package com.br.gerenciamento.autores.obras.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.gerenciamento.autores.obras.dto.ObraCreateDTO;
import com.br.gerenciamento.autores.obras.dto.ObraDTO;
import com.br.gerenciamento.autores.obras.service.CadastroObraService;

@RestController
@RequestMapping("/obra")
public class ObraController {

    private final CadastroObraService cadastroObraService;
    public ObraController(CadastroObraService cadastroObraService){
        this.cadastroObraService = cadastroObraService;
    }

    @PostMapping
    public ObraDTO cadastrarObra(@RequestBody ObraCreateDTO dto){
        return cadastroObraService.cadastrarObra(dto);
    }

}
