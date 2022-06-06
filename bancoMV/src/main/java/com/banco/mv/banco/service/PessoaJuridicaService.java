package com.banco.mv.banco.service;

import com.banco.mv.banco.exception.ClientNotFoundException;
import com.banco.mv.banco.model.Dto.PessoaJuridicaDTO;
import com.banco.mv.banco.model.PessoaFisica;
import com.banco.mv.banco.model.PessoaJuridica;
import com.banco.mv.banco.repository.PessoaJuridicaRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PessoaJuridicaService {
    private final PessoaJuridicaRepository pessoaJuridicaRepository;

    public List<PessoaJuridicaDTO> findAll() {
        return pessoaJuridicaRepository.findAll()
                .stream()
                .map(PessoaJuridica::toDto)
                .collect(Collectors.toList());
    }

    @SneakyThrows
    public PessoaJuridicaDTO findById(Long id) {
        return pessoaJuridicaRepository.findById(id).orElseThrow(() -> new ClientNotFoundException()).toDto();
    }

    public PessoaJuridicaDTO updateById(Long id, PessoaJuridicaDTO PessoaJuridicaDTO) {
        findById(id);
        PessoaJuridicaDTO.id = id;
        return pessoaJuridicaRepository.save(PessoaJuridicaDTO.toEntity()).toDto();
    }

    public void deleteById(Long id) {
        findById(id);
        pessoaJuridicaRepository.deleteById(id);
    }
}
