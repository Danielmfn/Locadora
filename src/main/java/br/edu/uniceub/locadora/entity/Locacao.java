package br.edu.uniceub.locadora.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="tb_locacao")
public class Locacao implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_locacao")
    private Long idLocacao;
    @Column(name = "id_cliente")
    private Long idCliente;
    @Column(name = "id_midia")
    private Long idMidia;
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

    public Long getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(Long id_locacao) {
        this.idLocacao = id_locacao;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long id_cliente) {
        this.idCliente = id_cliente;
    }

    public Long getIdMidia() {
        return idMidia;
    }

    public void setIdMidia(Long id_midia) {
        this.idMidia = id_midia;
    }

    public LocalDateTime getDtLocacao() {
        return dtLocacao;
    }

    public void setDtLocacao(LocalDateTime dt_locacao) {
        this.dtLocacao = dt_locacao;
    }
}
