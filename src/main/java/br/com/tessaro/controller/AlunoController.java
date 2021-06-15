package br.com.tessaro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tessaro.model.Aluno;
import br.com.tessaro.service.AlunoService;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Aluno>> buscarMaterias(){
		return new ResponseEntity<List<Aluno>>(service.buscarAlunos(), HttpStatus.OK);	
	}
	
	@CrossOrigin
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Aluno>> buscarMateriasById(@PathVariable Long id){
		return new ResponseEntity<Optional<Aluno>>(service.buscarAlunosById(id), HttpStatus.OK);	
	}
	
	@CrossOrigin
	@PostMapping
	public ResponseEntity<Aluno> insert(@RequestBody Aluno aluno) {
		return new ResponseEntity<Aluno>(service.inserir(aluno), HttpStatus.CREATED);
	}
	
}
