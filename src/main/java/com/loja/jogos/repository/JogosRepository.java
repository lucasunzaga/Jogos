package com.loja.jogos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.loja.jogos.model.Jogos;


public interface JogosRepository extends JpaRepository<Jogos, Long> {
	
	public List <Jogos> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	
	
}
