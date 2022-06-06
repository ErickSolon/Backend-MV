package com.banco.mv.banco.model.Dto;

import com.banco.mv.banco.model.PessoaFisica;
import com.banco.mv.banco.model.PessoaJuridica;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PessoaJuridicaDTO {
    public Long id;

    @NotBlank
    public String completeName;

    @CNPJ
    public String cnpj;

    @NotNull
    public int accountType;

    @NotNull
    public int phoneNumber;

    @NotNull
    public int totalBalance;

    @NotBlank
    public String startActivityDate;

    @NotBlank
    public String legalNature;

    @NotBlank
    public String cadastralStatus;

    @NotNull
    public int shareCapital;

    @NotBlank
    public String address;

    public PessoaJuridica toEntity() {
        return PessoaJuridica.builder()
                .id(id)
                .completeName(completeName)
                .cnpj(cnpj)
                .address(address)
                .accountType(accountType)
                .phoneNumber(phoneNumber)
                .totalBalance(totalBalance)
                .startActivityDate(startActivityDate)
                .legalNature(legalNature)
                .cadastralStatus(cadastralStatus)
                .shareCapital(shareCapital)
                .build();
    }
}
