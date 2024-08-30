package com.senai.bibliosenai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.bibliosenai.dtos.request.CreateBookDTO;

import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class BibliotecaController {
    
    @GetMapping("/biblioteca")
    public String findBiblioteca(){
        return "Teste";
    }


    // chat gpt fez isso

    // @GetMapping("/image")
    // public ResponseEntity<byte[]> getImage(@RequestParam("id") Long id) {
    //     Image image = "yellowRabbit.png";

    //     if (image == null) {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }

    //     HttpHeaders headers = new HttpHeaders();
    //     headers.set(HttpHeaders.CONTENT_TYPE, "image/png"); // ou outro tipo de imagem como "image/png"
    //     headers.set(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + image.getName() + "\"");
        
    //     return new ResponseEntity<>(image.getContent(), headers, HttpStatus.OK);
    // }


    // chat gpt fez isso


    @GetMapping("/yellowRabbit")
    public String youCant(){
        return "you can't🔪";
    }

    @GetMapping("/1985")
    public String saveThem(){
        return "S\b A\b V\b E\b T\b H\b E\b M\b";
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

    @PostMapping
    public ResponseEntity<?> postMethodName(@RequestBody CreateBookDTO dto) {

        System.out.println(dto.getAuthor());

        return ResponseEntity.status(201).build();
        
        
    }
    




}
