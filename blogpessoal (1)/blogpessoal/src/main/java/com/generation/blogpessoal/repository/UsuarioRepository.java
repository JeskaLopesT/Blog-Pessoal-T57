package com.generation.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	/*SELECT usuario FROM tb_usuarios WHERE usuario = "mirelle@gmail.com"*/
	public Optional<Usuario> findByUsuario(String usuario);

}
