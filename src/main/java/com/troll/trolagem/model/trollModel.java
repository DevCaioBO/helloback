package com.troll.trolagem.model;

import jakarta.persistence.Id;

public class trollModel {
	@Id
	private Long id;
	
	private String nome;
	

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
}
