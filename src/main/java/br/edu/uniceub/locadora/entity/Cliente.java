package br.edu.uniceub.locadora.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_cliente")
    private String idCliente;
    @Column(name = "ds_nome")
    private String nome;
    @Column(name = "ds_cpf")
    private Long cpf;
    @Column(name = "dt_matricula")
    private LocalDateTime dtMatricula;
    @Column(name = "ds_email")
    private String email;

    public Cliente() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return getIdCliente() != null ? getIdCliente().equals(cliente.getIdCliente()) : cliente.getIdCliente() == null;

    }

    @Override
    public int hashCode() {
        return getIdCliente() != null ? getIdCliente().hashCode() : 0;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String id) {
        this.idCliente = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getDtMatricula() {
        return dtMatricula;
    }

    public void setDtMatricula(LocalDateTime dt_matricula) {
        this.dtMatricula = dt_matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
