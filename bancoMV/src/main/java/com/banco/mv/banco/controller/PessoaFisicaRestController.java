package com.banco.mv.banco.controller;

import com.banco.mv.banco.model.Dto.PessoaFisicaDTO;
import com.banco.mv.banco.model.PessoaFisica;
import com.banco.mv.banco.service.PessoaFisicaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pessoafisica")
@RequiredArgsConstructor
public class PessoaFisicaRestController {
    private final PessoaFisicaService pessoaFisicaService;

    @GetMapping("/")
    public ResponseEntity<List<PessoaFisicaDTO>> getPessoaFisica() {
        List<PessoaFisicaDTO> pessoaFisicaDTOList = pessoaFisicaService.findAll();
        return ResponseEntity.ok(pessoaFisicaDTOList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaFisicaDTO> getPessoasFisicaById(@PathVariable Long id) {
        return ResponseEntity.ok(pessoaFisicaService.findById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PessoaFisicaDTO> updatePessoaFisicaById(@PathVariable Long id, @RequestBody PessoaFisicaDTO pessoaFisicaDTO) {
        return ResponseEntity.ok(pessoaFisicaService.updateById(id, pessoaFisicaDTO));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        pessoaFisicaService.deleteById(id);
    }

}
