package com.loja.jogos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
 
@Entity
@Table(name = "tb_jogos")
public class Jogos {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo título é Obrigatório!")
    @Size(min = 1, max = 100, message = "O atributo título deve conter no mínimo 01 e no máximo 100 caracteres")
    private String titulo;
    
    @NotBlank(message = "O atributo categoria é Obrigatório!")
    @Size(min = 1, max = 100, message = "O atributo texto deve conter no mínimo 01 e no máximo 100 caracteres")
    private String estilo;

    @NotBlank(message = "O atributo desenvolvedor é Obrigatório!")
    @Size(min = 1, max = 100, message = "O atributo texto deve conter no mínimo 01 e no máximo 100 caracteres")
    private String desenvolvedor;
    
    @NotNull(message = "O atributo ano é Obrigatório!")
    private Integer ano;
    
    @NotNull(message = "O atributo preço é Obrigatório!")
    private Float preco;
    
    @ManyToOne
    @JsonIgnoreProperties("jogos")
    private Categoria categoria;
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
}

    

