package es.binarycode.gesclas.entity;

import java.util.Date;

import javax.persistence.Column;

public abstract class AbstractEntity {

	
	@Column(name="FC_FECHA_ALTA")
	private Date fechaAlta;
	
	@Column(name="FC_FECHA_MOD")
	private Date fechaModificacion;
	
	@Column(name="ID_USUARIO_ALTA")
	private Integer idUsuAlta;
	
	@Column(name="ID_USUARIO_MOD")
	private Integer idUsuModificacion;

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
