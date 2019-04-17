package br.edu.uniceub.locadora.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="tb_midia")
public class Midia implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_midia")
    private Long idMidia;
    @Column(name = "id_tipo_midia")
    private Long idTipoMidia;
    @Column(name = "ds_nome")
    private String nome;
    @Column(name = "nu_faixa_etaria")
    private Integer faixaEtaria;
    @ManyToOne()
    private TipoMidia tipoMidia;

    @ManyToMany
    @JoinTable(name = "tb_genero",
            joinColumns = @JoinColumn(name = "idMidia"),
            inverseJoinColumns = @JoinColumn(name = "id_genero"))
    private List<Genero> generos;

    public Midia() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Midia midia = (Midia) o;

        return getId() != null ? getId().equals(midia.getId()) : midia.getId() == null;

    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    public Long getIdMidia() {
        return idMidia;
    }

    public void setIdMidia(Long id_midia) {
        this.idMidia = id_midia;
    }

    public Long getIdTipoMidia() {
        return idTipoMidia;
    }

    public void setIdTipoMidia(Long id_tipo_midia) {
        this.idTipoMidia = id_tipo_midia;
    }

    public Integer getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(Integer nu_faixa_etaria) {
        this.faixaEtaria = nu_faixa_etaria;
    }

    public Long getId() {
        return idMidia;
    }

    public void setId(Long id) {
        this.idMidia = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String ds_nome) {
        this.nome = ds_nome;
    }
}
