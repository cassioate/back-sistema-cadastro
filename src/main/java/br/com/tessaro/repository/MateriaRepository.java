package br.com.tessaro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.tessaro.model.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long>{
	
}

