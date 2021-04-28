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

import br.com.tessaro.model.Materia;
import br.com.tessaro.service.MateriaService;

@Controller
@RequestMapping("/materia")
public class MateriaController {
	
	@Autowired
	private MateriaService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Materia>> buscarMaterias(){
		return new ResponseEntity<List<Materia>>(service.buscarMaterias(), HttpStatus.OK);	
	}
	
	@CrossOrigin
	@PostMapping
	public ResponseEntity<Materia> insert(@RequestBody Materia materia) {
		return new ResponseEntity<Materia>(service.inserir(materia), HttpStatus.CREATED);
	}
}
