package com.sonystark.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityReturnValueHandler;

@RestController // GET - POST - PUT - DELETE
@RequestMapping("/api/usuario")
// http://localhost:8080/api/usuario
public class UsuarioController {
    @GetMapping
    public String boasVindas(){
        System.out.println("Olá, Mundo Filipe.");
        return "Seja Bem vindo. Olá Mundo!! dsabblablablalbla";
    }

    //criar um método para criar um usuário
    @PostMapping
    public ResponseEntity<> criarUsuario(
            @RequestBody UsuarioDTO usuarioDTO){

    }


}
