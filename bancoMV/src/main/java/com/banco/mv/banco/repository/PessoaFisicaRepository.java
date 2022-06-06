package com.banco.mv.banco.repository;

import com.banco.mv.banco.model.PessoaFisica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
    boolean existsById(Long id);
}
