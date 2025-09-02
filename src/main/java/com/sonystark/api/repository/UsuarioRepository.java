package com.sonystark.api.repository;

import com.sonystark.api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

//quem conecta o java ao banco de dados
public interface UsuarioRepository extends
        JpaRepository<Usuario,Long> {
}
