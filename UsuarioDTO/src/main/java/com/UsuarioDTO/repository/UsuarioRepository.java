package com.UsuarioDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UsuarioDTO.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
