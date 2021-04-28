package br.com.tessaro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.tessaro.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
