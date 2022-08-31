package com.generation.blogpessoal.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;


@RestController
@RequestMapping("/postagens")
public class PostagemController{

	@Autowired
	private PostagemRepository repository;
	
	// SELECT * FROM tb_postagem;
	@GetMapping
	public ResponseEntity<List<Postagem>> moranguete(){
		return ResponseEntity.ok(repository.findAll());
	}
	
}
