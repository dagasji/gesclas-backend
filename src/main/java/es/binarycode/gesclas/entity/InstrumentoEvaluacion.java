package es.binarycode.gesclas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INSTRUMENTO_EVALUACION")
public class InstrumentoEvaluacion extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_INSTRUMENTO_EVALUACION")
	private Integer idInstrumentoEvaluacion;
	
	@Column(name="DS_DESCRIPCION")
	private String descripcion;
	
	@Column(name="DS_DESCRIPCION_LARGA")
	private String descripcionLarga;
	
	@Column(name="ID_USUARIO")
	private String idUsuario;

	public Integer getIdInstrumentoEvaluacion() {
		return idInstrumentoEvaluacion;
	}

	public void setIdInstrumentoEvaluacion(Integer idInstrumentoEvaluacion) {
		this.idInstrumentoEvaluacion = idInstrumentoEvaluacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcionLarga() {
		return descripcionLarga;
	}

	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idInstrumentoEvaluacion == null) ? 0 : idInstrumentoEvaluacion.hashCode());
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
		InstrumentoEvaluacion other = (InstrumentoEvaluacion) obj;
		if (idInstrumentoEvaluacion == null) {
			if (other.idInstrumentoEvaluacion != null)
				return false;
		} else if (!idInstrumentoEvaluacion.equals(other.idInstrumentoEvaluacion))
			return false;
		return true;
	}

		
	
}
