package es.binarycode.gesclas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TIPO_CLASE")
public class TipoClase extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TIPO_CLASE")
	private Integer idTipoClase;
	
	@Column(name="DS_TIPO_CLASE")
	private String tipoClase;
	
	

	public Integer getIdTipoClase() {
		return idTipoClase;
	}

	public void setIdTipoClase(Integer idTipoClase) {
		this.idTipoClase = idTipoClase;
	}

	public String getTipoClase() {
		return tipoClase;
	}

	public void setTipoClase(String tipoClase) {
		this.tipoClase = tipoClase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoClase == null) ? 0 : idTipoClase.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoClase other = (TipoClase) obj;
		if (idTipoClase == null) {
			if (other.idTipoClase != null)
				return false;
		} else if (!idTipoClase.equals(other.idTipoClase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoClase [idTipoClase=" + idTipoClase + ", tipoClase=" + tipoClase + "]";
	}		
	
}
