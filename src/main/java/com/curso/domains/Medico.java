package com.curso.domains;

import com.curso.domains.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_medico")
    private int id;
    @NotNull @NotBlank
    private String nome;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataContratacao;
    @NotNull
    @Digits(integer = 15, fraction=2)
    private BigDecimal salario;
    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name="status")
    private Status status;

    public Medico() {
    }

    public Medico(int id, String nome, Date dataContratacao, BigDecimal salario, Status status) {
        this.id = id;
        this.nome = nome;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return getId() == medico.getId() && Objects.equals(getNome(), medico.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome());
    }
}
