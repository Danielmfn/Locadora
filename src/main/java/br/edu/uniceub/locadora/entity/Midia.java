package br.edu.uniceub.locadora.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="tb_midia")
public class Midia implements Serializable {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    @Column(name = "id_midia")
    private Integer idMidia;

    @ManyToOne
    @JoinColumn(name = "id_tipo_midia")
    private TipoMidia tpMidia;

    @Column(name = "ds_nome")
    private String nome;

    @Column(name = "nu_faixa_etaria")
    private Integer faixaEtaria;


    @ManyToMany
    @JoinTable(name = "tb_midia_genero",
            joinColumns = @JoinColumn(name = "id_midia"),
            inverseJoinColumns = @JoinColumn(name = "id_genero"))
    private List<Genero> generos;

    @OneToMany(mappedBy="midia")
    private List <Locacao> locacoes;

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

    public Integer getIdMidia() {
        return idMidia;
    }

    public void setIdMidia(Integer id_midia) {
        this.idMidia = id_midia;
    }

    public Integer getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(Integer nu_faixa_etaria) {
        this.faixaEtaria = nu_faixa_etaria;
    }

    public Integer getId() {
        return idMidia;
    }

    public void setId(Integer id) {
        this.idMidia = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String ds_nome) {
        this.nome = ds_nome;
    }

    public TipoMidia getTpMidia() {
        return tpMidia;
    }

    public void setTpMidia(TipoMidia tpMidia) {
        this.tpMidia = tpMidia;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
}
