package es.binarycode.gesclas.dto;

public class RubricaDTO extends GenericDTO {
	
	private Integer idRubrica;

	private IndicadorDTO indicador;
	
	private Integer nota;

	private String descripcion;

	private String idUsuario;

	public Integer getIdRubrica() {
		return idRubrica;
	}

	public void setIdRubrica(Integer idRubrica) {
		this.idRubrica = idRubrica;
	}

	public IndicadorDTO getIndicador() {
		return indicador;
	}

	public void setIndicador(IndicadorDTO indicador) {
		this.indicador = indicador;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
		result = prime * result + ((idRubrica == null) ? 0 : idRubrica.hashCode());
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
		RubricaDTO other = (RubricaDTO) obj;
		if (idRubrica == null) {
			if (other.idRubrica != null)
				return false;
		} else if (!idRubrica.equals(other.idRubrica))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RubricaDTO [idRubrica=" + idRubrica + ", indicador=" + indicador + ", nota=" + nota + ", descripcion="
				+ descripcion + ", idUsuario=" + idUsuario + "]";
	}

	

}
