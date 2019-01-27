package es.binarycode.gesclas.dto;

public class IndicadorDTO extends GenericDTO {
	
	private Integer idIndicador;
	
	private String descripcionCorta;
	
	private String descripcionLarga;
	

	private String idUsuario;


	public Integer getIdIndicador() {
		return idIndicador;
	}


	public void setIdIndicador(Integer idIndicador) {
		this.idIndicador = idIndicador;
	}


	public String getDescripcionCorta() {
		return descripcionCorta;
	}


	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
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
		result = prime * result + ((idIndicador == null) ? 0 : idIndicador.hashCode());
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
		IndicadorDTO other = (IndicadorDTO) obj;
		if (idIndicador == null) {
			if (other.idIndicador != null)
				return false;
		} else if (!idIndicador.equals(other.idIndicador))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "IndicadorDTO [idIndicador=" + idIndicador + ", descripcionCorta=" + descripcionCorta
				+ ", descripcionLarga=" + descripcionLarga + ", idUsuario=" + idUsuario + "]";
	}

	
	
}
