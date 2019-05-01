package es.binarycode.gesclas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLASE")
public class Clase extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CLASE")
	private Integer idClase;
	
	@Column(name="NM_ANIO")
	private Integer anio;
	
	@Column(name="DS_DESCRIPCION")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_CLASE_FK")
	private TipoClase tipoClase;
	
	@Column(name="DS_OBSERVACIONES")
	private String observaciones;
	
	@Column(name="ID_USUARIO")
	private Integer idUsuario;	

	public Integer getIdClase() {
		return idClase;
	}

	public void setIdClase(Integer idClase) {
		this.idClase = idClase;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoClase getTipoClase() {
		return tipoClase;
	}

	public void setTipoClase(TipoClase tipoClase) {
		this.tipoClase = tipoClase;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClase == null) ? 0 : idClase.hashCode());
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
		Clase other = (Clase) obj;
		if (idClase == null) {
			if (other.idClase != null)
				return false;
		} else if (!idClase.equals(other.idClase))
			return false;
		return true;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
}
