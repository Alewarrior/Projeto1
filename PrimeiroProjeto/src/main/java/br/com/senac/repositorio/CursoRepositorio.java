package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepositorio extends JpaRepository<CursoRepositorio, Integer>{

}
