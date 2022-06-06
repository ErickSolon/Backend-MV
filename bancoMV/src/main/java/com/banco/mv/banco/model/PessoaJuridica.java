package com.banco.mv.banco.model;

import com.banco.mv.banco.model.Dto.PessoaFisicaDTO;
import com.banco.mv.banco.model.Dto.PessoaJuridicaDTO;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PessoaJuridica")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PessoaJuridica {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CompleteName")
    private String completeName;

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "AccountType")
    private int accountType;

    @Column(name = "PhoneNumber")
    private int phoneNumber;

    @Column(name = "TotalBalance")
    private int totalBalance;

    @Column(name = "StartActivityDate")
    private String startActivityDate;

    @Column(name = "LegalNature")
    private String legalNature;

    @Column(name = "CadastralStatus")
    private String cadastralStatus;

    @Column(name = "ShareCapital")
    private int shareCapital;

    @Column(name = "Address")
    private String address;

    public PessoaJuridicaDTO toDto() {
        return PessoaJuridicaDTO.builder()
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
