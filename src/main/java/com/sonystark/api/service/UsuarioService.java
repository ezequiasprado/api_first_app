package com.sonystark.api.service;

import com.sonystark.api.dto.UsuarioDTO;
import com.sonystark.api.entity.Usuario;
import com.sonystark.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    //criar um objeto repository
    @Autowired
    private UsuarioRepository repository;
    //método para salvar usuário
    public UsuarioDTO save(UsuarioDTO dto){
        Usuario usuario = convertToEntity(dto);
        usuario = repository.save(usuario);//só podemos enviar entity
        return convertTODTO(usuario);
    }
    //criar método para convert DTO Para Entidade
    public Usuario convertToEntity(UsuarioDTO dto){
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        return usuario;
    }
    //método para converter entidade para DTO
    public UsuarioDTO convertTODTO(Usuario usuario){
        UsuarioDTO dto = new UsuarioDTO();
        dto.setNome(usuario.getNome());
        dto.setEmail(usuario.getEmail());
        dto.setSenha(usuario.getSenha());
        return dto;
    }
}
