package es.binarycode.gesclas.dto;

public class TemaIndicadorDTO extends GenericDTO {
	
	private Integer idTemaIndicador;
	
	private TemaDTO tema;
	
	private IndicadorDTO indicador;
	
	private String idUsuario;
	
	private Float ponderacion;

	public Integer getIdTemaIndicador() {
		return idTemaIndicador;
	}

	public void setIdTemaIndicador(Integer idTemaIndicador) {
		this.idTemaIndicador = idTemaIndicador;
	}

	public TemaDTO getTema() {
		return tema;
	}

	public void setTema(TemaDTO tema) {
		this.tema = tema;
	}

	public IndicadorDTO getIndicador() {
		return indicador;
	}

	public void setIndicador(IndicadorDTO indicador) {
		this.indicador = indicador;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Float getPonderacion() {
		return ponderacion;
	}

	public void setPonderacion(Float ponderacion) {
		this.ponderacion = ponderacion;
	}

	@Override
	public String toString() {
		return "TemaIndicadorDTO [idTemaIndicador=" + idTemaIndicador + ", tema=" + tema + ", indicador=" + indicador
				+ ", idUsuario=" + idUsuario + ", ponderacion=" + ponderacion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTemaIndicador == null) ? 0 : idTemaIndicador.hashCode());
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
		TemaIndicadorDTO other = (TemaIndicadorDTO) obj;
		if (idTemaIndicador == null) {
			if (other.idTemaIndicador != null)
				return false;
		} else if (!idTemaIndicador.equals(other.idTemaIndicador))
			return false;
		return true;
	}

		
}
