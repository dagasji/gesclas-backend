package es.binarycode.gesclas.dto;

public class NotaDTO extends GenericDTO {
	
	private Integer idNota;
	
	private TemaIndicadorInstrumentoDTO temaIndicadorInstrumento;
	
	private ClaseAlumnoDTO claseAlumno;
		
	private Float nota;
	
	private String idUsuario;

	public Integer getIdNota() {
		return idNota;
	}

	public void setIdNota(Integer idNota) {
		this.idNota = idNota;
	}

	public TemaIndicadorInstrumentoDTO getTemaIndicadorInstrumento() {
		return temaIndicadorInstrumento;
	}

	public void setTemaIndicadorInstrumento(TemaIndicadorInstrumentoDTO temaIndicadorInstrumento) {
		this.temaIndicadorInstrumento = temaIndicadorInstrumento;
	}

	public ClaseAlumnoDTO getClaseAlumno() {
		return claseAlumno;
	}

	public void setClaseAlumno(ClaseAlumnoDTO claseAlumno) {
		this.claseAlumno = claseAlumno;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
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
		result = prime * result + ((idNota == null) ? 0 : idNota.hashCode());
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
		NotaDTO other = (NotaDTO) obj;
		if (idNota == null) {
			if (other.idNota != null)
				return false;
		} else if (!idNota.equals(other.idNota))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NotaDTO [idNota=" + idNota + ", temaIndicadorInstrumento=" + temaIndicadorInstrumento + ", claseAlumno="
				+ claseAlumno + ", nota=" + nota + ", idUsuario=" + idUsuario + "]";
	}

	

	
}
