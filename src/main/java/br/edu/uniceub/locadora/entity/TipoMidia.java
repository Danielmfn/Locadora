package br.edu.uniceub.locadora.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="tb_tipo_midia")
public class TipoMidia implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_tipo_midia")
    private Long id;
    @Column(name = "ds_nome")
    private Long idGenero;
    @OneToMany(mappedBy = "tipoMidia")
    private List<Midia> midias;

    public TipoMidia() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoMidia tipoMidia = (TipoMidia) o;

        return getId() != null ? getId().equals(tipoMidia.getId()) : tipoMidia.getId() == null;

    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long id_genero) {
        this.idGenero = id_genero;
    }
}
