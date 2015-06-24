
package com.unitec.weba;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Table(name="administracion")
public class Administracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SESION")
    private Integer idSesion;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String ip;
    @JoinColumn(name = "ID_Usuario", referencedColumnName = "ID_Usuario")
    @ManyToOne
    private Usuario_1 iDUsuario;

    public Administracion() {
    }

    public Administracion(Integer idSesion) {
        this.idSesion = idSesion;
    }

    public Integer getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(Integer idSesion) {
        this.idSesion = idSesion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Usuario_1 getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(Usuario_1 iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSesion != null ? idSesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administracion)) {
            return false;
        }
        Administracion other = (Administracion) object;
        if ((this.idSesion == null && other.idSesion != null) || (this.idSesion != null && !this.idSesion.equals(other.idSesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unitec.weba.Administracion[ idSesion=" + idSesion + " ]";
    }

    void setIDUsuario(Usuario u1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
