package com.banco.mv.banco.repository;

import com.banco.mv.banco.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
    boolean existsById(Long id);

}
