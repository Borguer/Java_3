package com.unitec.weba;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    
    @Column(name = "ID_Usuario")
    private Integer iDUsuario;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "login")
    private String login;
    
    @Column(name = "password")
    private String password;

    public Usuario() {
    }

    public Usuario(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public Integer getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDUsuario != null ? iDUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.iDUsuario == null && other.iDUsuario != null) || (this.iDUsuario != null && !this.iDUsuario.equals(other.iDUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unitec.weba.Usuario[ iDUsuario=" + iDUsuario + " ]";
    }
    
}
