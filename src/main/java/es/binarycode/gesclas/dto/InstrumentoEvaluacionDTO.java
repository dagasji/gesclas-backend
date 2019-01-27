package es.binarycode.gesclas.dto;

public class InstrumentoEvaluacionDTO extends GenericDTO {
	
	private Integer idInstrumentoEvaluacion;
	
	private String descripcion;
	
	private String descripcionLarga;
	
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
		InstrumentoEvaluacionDTO other = (InstrumentoEvaluacionDTO) obj;
		if (idInstrumentoEvaluacion == null) {
			if (other.idInstrumentoEvaluacion != null)
				return false;
		} else if (!idInstrumentoEvaluacion.equals(other.idInstrumentoEvaluacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InstrumentoEvaluacion [idInstrumentoEvaluacion=" + idInstrumentoEvaluacion + ", descripcion="
				+ descripcion + ", descripcionLarga=" + descripcionLarga + ", idUsuario=" + idUsuario + "]";
	}

		
	
}
