package com.generation.myGameStore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author Pedro
 * @version 1.1
 *
 */

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(min = 2, max = 100)
	private String produto;

	@NotBlank
	@Size(min = 2, max = 500)
	private String descricao;

	@NotNull
	private int estoque;

	@NotNull
	private double valor;

	
	@ManyToOne
	@JoinColumn(name = "fk_categoria")
	@JsonIgnoreProperties("produtos")
	private CategoriaModel categoriaDoProduto;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public CategoriaModel getCategoriaDoProduto() {
		return categoriaDoProduto;
	}

	public void setCategoriaDoProduto(CategoriaModel categoriaDoProduto) {
		this.categoriaDoProduto = categoriaDoProduto;
	}

}
