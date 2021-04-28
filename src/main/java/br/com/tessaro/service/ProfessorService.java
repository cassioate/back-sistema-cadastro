package br.com.tessaro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tessaro.model.Professor;
import br.com.tessaro.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository repository;

	public List<Professor> buscarProfessor() {
		return repository.findAll();
	}

	public Professor inserir(Professor professor) {
		return repository.save(professor);
	}
	
}
