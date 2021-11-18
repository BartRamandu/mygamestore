package com.generation.myGameStore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;


/**
 * 
 * @author marianatheml
 * @version 1.1
 *
 */

@Entity
@Table(name = "tb_usuario")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome é obrigatório!")
	@Size(min = 2, max = 100)
	private String nome;
	
	@ApiModelProperty (example = "email@email.com.br")
	@NotBlank(message = "O usuário é obrigatório!")
	@Email(message = "O usuário deve ser um e-mail válido!")
	@Size(min = 2, max = 100)
	private String usuario;
	
	@NotBlank(message = "A senha é obrigatória!")
	@Size(min = 6, max = 100, message = "O atributo senha deve ter no mínimo 6 caracteres!")
	private String senha;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
