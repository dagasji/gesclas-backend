package es.binarycode.gesclas.dto;

public class ClaseDTO extends GenericDTO {
	
	private Integer idClase;
	
	private Integer anio;
	
	private String descripcion;
	
	private TipoClaseDTO tipoClase;

	private String observaciones;

	private String idUsuario;	

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

	public TipoClaseDTO getTipoClase() {
		return tipoClase;
	}

	public void setTipoClase(TipoClaseDTO tipoClase) {
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
		ClaseDTO other = (ClaseDTO) obj;
		if (idClase == null) {
			if (other.idClase != null)
				return false;
		} else if (!idClase.equals(other.idClase))
			return false;
		return true;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return "ClaseDTO [idClase=" + idClase + ", anio=" + anio + ", descripcion=" + descripcion + ", tipoClase="
				+ tipoClase + ", observaciones=" + observaciones + ", idUsuario=" + idUsuario + "]";
	}
	
	
	
}
