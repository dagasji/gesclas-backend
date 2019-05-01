package es.binarycode.gesclas.dto;

import java.util.Date;

public class TipoClaseDTO extends GenericDTO{
	
	private Integer idTipoClase;
	
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
		TipoClaseDTO other = (TipoClaseDTO) obj;
		if (idTipoClase == null) {
			if (other.idTipoClase != null)
				return false;
		} else if (!idTipoClase.equals(other.idTipoClase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoClaseDTO [idTipoClase=" + idTipoClase + ", tipoClase=" + tipoClase + "]";
	}

			
}
