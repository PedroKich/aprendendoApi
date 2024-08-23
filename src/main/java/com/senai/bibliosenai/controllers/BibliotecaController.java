package com.senai.bibliosenai.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class BibliotecaController {
    
    @GetMapping("/biblioteca")
    public String findBiblioteca(){
        return "Teste";
    }

    @PostMapping("/livros")
    public String createBiblioteca(){
        return "Criado";
    }

    @DeleteMapping("/livros/{id}")
    public String deleteLivros(@PathVariable("id") int idLivro){
        return "Deletado";
    }

    @PatchMapping("/livros/{id}")
    public String alterarCodigoLivro(@PathVariable("id") int idLivro){
        return "Codigo do livro foi alterado";
    }

    @PutMapping("/livros/{id}")
    public String alteraObjetoLivro(@PathVariable("id") int idLivro){
        return "Todos os campos alterados";
    }

}
