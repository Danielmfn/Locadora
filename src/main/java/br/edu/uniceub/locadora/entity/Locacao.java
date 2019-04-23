package br.edu.uniceub.locadora.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="tb_locacao")
public class Locacao implements Serializable {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    @Column(name = "id_locacao")
    private Integer idLocacao;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente clientes;

    @ManyToOne
    @JoinColumn(name = "id_midia")
    private Midia midia;

    @Column(name = "dt_locacao")
    private LocalDateTime dtLocacao;

    public Locacao() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Locacao locacao = (Locacao) o;

        return getIdLocacao() != null ? getIdLocacao().equals(locacao.getIdLocacao()) : locacao.getIdLocacao() == null;

    }

    @Override
    public int hashCode() {
        return getIdLocacao() != null ? getIdLocacao().hashCode() : 0;
    }


    public Integer getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(Integer id_locacao) {
        this.idLocacao = id_locacao;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public LocalDateTime getDtLocacao() {
        return dtLocacao;
    }

    public void setDtLocacao(LocalDateTime dt_locacao) {
        this.dtLocacao = dt_locacao;
    }
}
