package br.edu.uniceub.locadora.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "ds_nome")
    private String nome;

    @Column(name = "ds_cpf")
    private String cpf;

    @Column(name = "dt_matricula")
    private LocalDateTime dtMatricula;

    @Column(name = "ds_email")
    private String email;

    @OneToMany(mappedBy="clientes")
    private List<Locacao> locacoes;

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

    public Integer getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(Integer id) {
        this.idCliente = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
}

