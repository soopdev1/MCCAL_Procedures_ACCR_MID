/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.so.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author rcosco
 */
@Entity
@Table(name = "comuni")
public class Comuni implements Serializable {

    @Id
    @Column(name = "idcomune")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
//    @Column(name = "cap")
//    private int cap;
    @Column(name = "provincia")
    private String provincia;
    @Column(name = "nome_provincia")
    private String nome_provincia;
    @Column(name = "regione")
    private String regione;
    @Column(name = "istat")
    private String istat;
    @Column(name = "cod_regione")
    private String cod_regione;
    @Column(name = "cod_provincia")
    private String cod_provincia;
    @Column(name = "cod_comune")
    private String cod_comune;
    @Column(name = "cittadinanza")
    private int cittadinanza;
    @Column(name = "codicicatastali_altri")
    private String codicicatastali_altri;

    @OneToOne(mappedBy = "id", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private ComuniCoord coordinate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getNome_provincia() {
        return nome_provincia;
    }

    public void setNome_provincia(String nome_provincia) {
        this.nome_provincia = nome_provincia;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public String getIstat() {
        return istat;
    }

    public void setIstat(String istat) {
        this.istat = istat;
    }

    public int getCittadinanza() {
        return cittadinanza;
    }

    public void setCittadinanza(int cittadinanza) {
        this.cittadinanza = cittadinanza;
    }

    public String getCod_regione() {
        return cod_regione;
    }

    public void setCod_regione(String cod_regione) {
        this.cod_regione = cod_regione;
    }

    public String getCod_provincia() {
        return cod_provincia;
    }

    public void setCod_provincia(String cod_provincia) {
        this.cod_provincia = cod_provincia;
    }

    public String getCod_comune() {
        return cod_comune;
    }

    public void setCod_comune(String cod_comune) {
        this.cod_comune = cod_comune;
    }

    public String getCodicicatastali_altri() {
        return codicicatastali_altri;
    }

    public void setCodicicatastali_altri(String codicicatastali_altri) {
        this.codicicatastali_altri = codicicatastali_altri;
    }

    public ComuniCoord getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(ComuniCoord coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Comuni)) {
            return false;
        }
        Comuni other = (Comuni) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

   @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

}
