package br.com.tessaro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tessaro.model.Materia;
import br.com.tessaro.repository.MateriaRepository;

@Service
public class MateriaService {
	
	@Autowired
	private MateriaRepository repository;

	public List<Materia> buscarMaterias() {
		return repository.findAll();
	}

	public Materia inserir(Materia materia) {
		return repository.save(materia);
	}

}