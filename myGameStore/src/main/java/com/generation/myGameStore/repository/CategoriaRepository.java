package com.generation.myGameStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.myGameStore.model.CategoriaModel;

/**
 * Inteface reponseble for inheriting crud methods
 * 
 * @return List<ProdutoModel>
 * @author marianatheml
 * @since 1.0
 *
 */

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	
	public List<CategoriaModel> findAllByDescricaoContainingIgnoreCase (String descricao);
	
}
