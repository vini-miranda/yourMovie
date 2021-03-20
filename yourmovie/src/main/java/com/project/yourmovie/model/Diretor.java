package com.project.yourmovie.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_diretor")
public class Diretor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 200)
	private String nome;
	
	@OneToMany(mappedBy = "diretor", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("diretor")
	private List<Filme> filme;

	
	//---------get and set----------//
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Filme> getFilme() {
		return filme;
	}

	public void setFilme(List<Filme> filme) {
		this.filme = filme;
	}

}
