package com.banco.mv.banco.model;

import com.banco.mv.banco.model.Dto.PessoaFisicaDTO;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PessoaFisica")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PessoaFisica {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CompleteName")
    private String completeName;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "Address")
    private String address;

    @Column(name = "AccountType")
    private byte accountType;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "TotalBalance")
    private int totalBalance;

    public PessoaFisicaDTO toDto() {
        return PessoaFisicaDTO.builder()
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
