package com.banco.mv.banco.controller;

import com.banco.mv.banco.model.Dto.PessoaFisicaDTO;
import com.banco.mv.banco.model.Dto.PessoaJuridicaDTO;
import com.banco.mv.banco.model.PessoaJuridica;
import com.banco.mv.banco.service.PessoaJuridicaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/pessoajuridica")
public class PessoaJuridicaRestController {
    private final PessoaJuridicaService pessoaJuridicaService;

    @GetMapping
    public ResponseEntity<List<PessoaJuridicaDTO>> getPessoaJuridica() {
        List<PessoaJuridicaDTO> PessoaJuridicaDTOList = pessoaJuridicaService.findAll();
        return ResponseEntity.ok(PessoaJuridicaDTOList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaJuridicaDTO> getPessoasFisicaById(@PathVariable Long id) {
        return ResponseEntity.ok(pessoaJuridicaService.findById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PessoaJuridicaDTO> updatePessoaFisicaById(@PathVariable Long id, @RequestBody PessoaJuridicaDTO PessoaJuridicaDTO) {
        return ResponseEntity.ok(pessoaJuridicaService.updateById(id, PessoaJuridicaDTO));
    }

    @PostMapping("/create")
    public ResponseEntity<PessoaJuridicaDTO> createPessoaJuridica(@RequestBody PessoaJuridicaDTO pessoaJuridicaDTO) {
        return ResponseEntity.ok(pessoaJuridicaService.save(pessoaJuridicaDTO));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        pessoaJuridicaService.deleteById(id);
    }
}
