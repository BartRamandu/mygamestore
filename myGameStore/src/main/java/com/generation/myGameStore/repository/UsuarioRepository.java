package com.generation.myGameStore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.myGameStore.model.UsuarioModel;

/**
 * 
 * @author marianatheml
 * @version 1.0
 * 
 */

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
	
	public Optional<UsuarioModel> findByUsuario(String usuario);	

}
