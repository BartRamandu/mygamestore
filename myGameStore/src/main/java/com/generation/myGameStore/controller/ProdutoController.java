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

import com.generation.myGameStore.model.ProdutoModel;
import com.generation.myGameStore.repository.ProdutoRepository;

/**
 * 
 * @author marianatheml
 * @since 1.0
 *
 */

@RestController
@RequestMapping ("/produtos")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> findAllProduto () {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/byId/{id}")
	public ResponseEntity<Optional<ProdutoModel>> findByIdProduto (@PathVariable("id") Long id) {
		return ResponseEntity.ok(repository.findById(id));
	}
	
	@GetMapping("/byDescricao/{descricao}")
	public ResponseEntity<List<ProdutoModel>> findByDescricaoProduto (@PathVariable("descricao") String descricao) {
		return ResponseEntity.ok(repository.findByDescricaoContainingIgnoreCase(descricao));
	}
	

}
