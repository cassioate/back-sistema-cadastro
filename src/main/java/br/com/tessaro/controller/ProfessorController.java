package br.com.tessaro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tessaro.model.Professor;
import br.com.tessaro.service.ProfessorService;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

	@Autowired
	private ProfessorService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Professor>> buscarMaterias(){
		return new ResponseEntity<List<Professor>>(service.buscarProfessor(), HttpStatus.OK);	
	}
	
	@CrossOrigin
	@PostMapping
	public ResponseEntity<Professor> insert(@RequestBody Professor professor) {
		return new ResponseEntity<Professor>(service.inserir(professor), HttpStatus.CREATED);
	}
	
}
