package br.com.tessaro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tessaro.model.Aluno;
import br.com.tessaro.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;

	public List<Aluno> buscarAlunos() {
		return repository.findAll();
	}

	public Aluno inserir(Aluno aluno) {
		return repository.save(aluno);
	}
	
}
