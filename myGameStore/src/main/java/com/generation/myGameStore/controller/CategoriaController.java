package com.generation.myGameStore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.myGameStore.model.CategoriaModel;
import com.generation.myGameStore.repository.CategoriaRepository;

/**
 * 
 * @author marianatheml
 * @since 1.0
 *
 */

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> findAllCategoria () {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/byId/{id}")
	public ResponseEntity<Optional<CategoriaModel>> findByIdCategoria (@PathVariable("id") Long id) {
		return ResponseEntity.ok(repository.findById(id));
	}
	
	@GetMapping("/byDescricao/{descricao}")
	public ResponseEntity<List<CategoriaModel>> findByDescricaoCategoria (@PathVariable("descricao") String descricao) {
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
}
