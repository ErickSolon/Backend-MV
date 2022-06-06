package com.banco.mv.banco.model.Dto;

import com.banco.mv.banco.model.PessoaFisica;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisicaDTO {
    public Long id;

    @NotBlank
    public String completeName;

    @CPF
    public String cpf;

    @NotBlank(message = "Mensagem null")
    public String address;

    @NotNull
    public byte accountType;

    @NotBlank
    public String phoneNumber;

    @NotNull
    public int totalBalance;

    public PessoaFisica toEntity() {
        return PessoaFisica.builder()
                .id(id)
                .completeName(completeName)
                .cpf(cpf)
                .address(address)
                .accountType(accountType)
                .phoneNumber(phoneNumber)
                .totalBalance(totalBalance)
                .build();
    }
}
