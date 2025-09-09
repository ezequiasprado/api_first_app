package com.sonystark.api.controller;

import com.sonystark.api.dto.UsuarioDTO;
import com.sonystark.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityReturnValueHandler;

@RestController // GET - POST - PUT - DELETE
@RequestMapping("/api/usuario")
// http://localhost:8080/api/usuario
public class UsuarioController {
    @Autowired //auto injeção de dependencias
    private UsuarioService service;
    @GetMapping
    public String boasVindas(){
        System.out.println("Olá, Mundo Filipe.");
        return "Seja Bem vindo. Olá Mundo!! dsabblablablalbla";
    }
    //criar um método para salvar um usuário no BD
    // usuarioDTO: { "nome":"Filipe", "email":"filipe@gmail","senha":"123"}
    @PostMapping
    public UsuarioDTO criarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        return service.save(usuarioDTO);
    }


}
