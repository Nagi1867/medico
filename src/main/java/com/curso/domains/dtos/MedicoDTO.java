package com.curso.domains.dtos;

import com.curso.domains.Medico;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

public class MedicoDTO {
    private long id;
    @NotNull(message = "O campo nome social não pode ser nulo")
    @NotBlank(message = "O campo nome social não pode ser vazio")
    private String nome;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataContratacao;
    @NotNull(message = "O campo valor não pode ser nulo")
    @Digits(integer = 15, fraction = 2)
    private BigDecimal salario;
    private int status;

    public MedicoDTO() {}

    public MedicoDTO(long id, String nome, Date dataContratacao, BigDecimal salario, int status) {
        this.id = id;
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
        this.status = status;
    }

    public MedicoDTO(Medico obj) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nome não pode ser vazio") @NotBlank(message = "O campo nome não pode ser vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo nome não pode ser vazio") @NotBlank(message = "O campo nome não pode ser vazio") String nome) {
        this.nome = nome;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
