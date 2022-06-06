package com.banco.mv.banco.service;

import com.banco.mv.banco.exception.ClientNotFoundException;
import com.banco.mv.banco.model.Dto.PessoaFisicaDTO;
import com.banco.mv.banco.model.PessoaFisica;
import com.banco.mv.banco.repository.PessoaFisicaRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PessoaFisicaService {
    private final PessoaFisicaRepository pessoaFisicaRepository;

    public List<PessoaFisicaDTO> findAll() {
        return pessoaFisicaRepository.findAll()
                .stream()
                .map(PessoaFisica::toDto)
                .collect(Collectors.toList());
    }

    @SneakyThrows
    public PessoaFisicaDTO findById(Long id) {
        return pessoaFisicaRepository.findById(id).orElseThrow(() -> new ClientNotFoundException()).toDto();
    }

    public PessoaFisicaDTO updateById(Long id, PessoaFisicaDTO pessoaFisicaDTO) {
        findById(id);
        pessoaFisicaDTO.id = id;
        return pessoaFisicaRepository.save(pessoaFisicaDTO.toEntity()).toDto();
    }

    public void deleteById(Long id) {
        findById(id);
        pessoaFisicaRepository.deleteById(id);
    }
}
