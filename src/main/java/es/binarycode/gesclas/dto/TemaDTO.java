package es.binarycode.gesclas.dto;

public class TemaDTO extends GenericDTO {
	
	private Integer idTema;
	
	private String descripcionCorta;

	private String descripcionLarga;
	
	private String idUsuario;

	public Integer getIdTema() {
		return idTema;
	}

	public void setIdTema(Integer idTema) {
		this.idTema = idTema;
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
	public String toString() {
		return "TemaDTO [idTema=" + idTema + ", descripcionCorta=" + descripcionCorta + ", descripcionLarga="
				+ descripcionLarga + ", idUsuario=" + idUsuario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTema == null) ? 0 : idTema.hashCode());
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
		TemaDTO other = (TemaDTO) obj;
		if (idTema == null) {
			if (other.idTema != null)
				return false;
		} else if (!idTema.equals(other.idTema))
			return false;
		return true;
	}

	
	
}
