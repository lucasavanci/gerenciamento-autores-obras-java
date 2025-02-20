package com.br.gerenciamento.autores.obras.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.gerenciamento.autores.obras.dto.AutorCreateDTO;
import com.br.gerenciamento.autores.obras.dto.AutorDTO;
import com.br.gerenciamento.autores.obras.service.CadastroAutorService;

@RestController
@RequestMapping("/autor")
public class AutorController {

    private final CadastroAutorService autorService;
    public AutorController(CadastroAutorService autorService){
        this.autorService = autorService;
    }

    @PostMapping
    public AutorDTO cadastrarAutor(@RequestBody AutorCreateDTO dto) {
        return autorService.cadastrarAutor(dto);
    }

}
