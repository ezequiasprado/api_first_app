package com.sonystark.api.dto;
import jakarta.validation.constraints.*;

//DTO - objeto de transferencia de dados - "comanda"
public class UsuarioDTO {
    @NotBlank(message = "o nome é obrigatório.")
    @Size(min=2,max=100,message="O nome deve ter entre 2 e 100 caracteres")
    private String nome;
    @NotBlank(message = "O email é obrigatório.")
    @Email
    private String email;
    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 6,max=100,message="senha deve ter no minimo 6 caracteres")
    private String senha;
    //construtores UsuarioDTO usuarioDTO = new UsuarioDTO();

    public UsuarioDTO() {
    }

    public UsuarioDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
