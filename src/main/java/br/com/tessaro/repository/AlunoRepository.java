package br.com.tessaro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tessaro.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
