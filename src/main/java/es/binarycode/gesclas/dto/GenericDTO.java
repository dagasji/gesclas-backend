package es.binarycode.gesclas.dto;

import java.util.Date;

/**
 * All DTOs must inherit from this class. Just a way to force to implement theses functions in each class.
 * @author dgaspar
 *
 */
public abstract class GenericDTO {
	
	private Date fechaAlta;
	
	private Date fechaModificacion;
	
	private Integer idUsuAlta;
	
	private Integer idUsuModificacion;

	public abstract String toString();
	
	public abstract boolean equals(Object obj);
	
	public abstract int hashCode();

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Integer getIdUsuAlta() {
		return idUsuAlta;
	}

	public void setIdUsuAlta(Integer idUsuAlta) {
		this.idUsuAlta = idUsuAlta;
	}

	public Integer getIdUsuModificacion() {
		return idUsuModificacion;
	}

	public void setIdUsuModificacion(Integer idUsuModificacion) {
		this.idUsuModificacion = idUsuModificacion;
	}
}
