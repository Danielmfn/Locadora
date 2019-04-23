package br.edu.uniceub.locadora.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="tb_tipo_midia")
public class TipoMidia implements Serializable {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    @Column(name = "id_tipo_midia")
    private Integer id;

    @Column(name = "ds_nome")
    private String tpMidia;

    @OneToMany(mappedBy = "tpMidia")
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public List<Midia> getMidias() {
        return midias;
    }

    public void setMidias(List<Midia> midias) {
        this.midias = midias;
    }

    public String getTpMidia() {
        return tpMidia;
    }

    public void setTpMidia(String tpMidia) {
        this.tpMidia = tpMidia;
    }
}
