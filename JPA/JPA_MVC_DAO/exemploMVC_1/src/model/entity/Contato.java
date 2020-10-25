/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Iara Silva
 */
@Entity
@Table(name = "contato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contato.findAll", query = "SELECT c FROM Contato c")
    , @NamedQuery(name = "Contato.findById", query = "SELECT c FROM Contato c WHERE c.id = :id")
    , @NamedQuery(name = "Contato.findByNome", query = "SELECT c FROM Contato c WHERE c.nome LIKE :nome")
    , @NamedQuery(name = "Contato.findByTelefone", query = "SELECT c FROM Contato c WHERE c.telefone = :telefone")})
public class Contato implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;

    public Contato() {
    }

    public Contato(Long id) {
        this.id = id;
    }

    public Contato(Long id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contato)) {
            return false;
        }
        Contato other = (Contato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Contato[ id=" + id + " nome= "+ nome +" telefone="+ telefone +" ]";
    }
    
}
