package es.binarycode.gesclas.dto;

public class TemaIndicadorInstrumentoDTO extends GenericDTO {
	
	private Integer idTemaIndicadorInstru;
	
	private TemaIndicadorDTO temaIndicador;
	
	private TemaInstruEvalDTO temaInstruEval;
	
	private String idUsuario;

	public Integer getIdTemaIndicadorInstru() {
		return idTemaIndicadorInstru;
	}

	public void setIdTemaIndicadorInstru(Integer idTemaIndicadorInstru) {
		this.idTemaIndicadorInstru = idTemaIndicadorInstru;
	}

	public TemaIndicadorDTO getTemaIndicador() {
		return temaIndicador;
	}

	public void setTemaIndicador(TemaIndicadorDTO temaIndicador) {
		this.temaIndicador = temaIndicador;
	}

	public TemaInstruEvalDTO getTemaInstruEval() {
		return temaInstruEval;
	}

	public void setTemaInstruEval(TemaInstruEvalDTO temaInstruEval) {
		this.temaInstruEval = temaInstruEval;
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
		result = prime * result + ((idTemaIndicadorInstru == null) ? 0 : idTemaIndicadorInstru.hashCode());
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
		TemaIndicadorInstrumentoDTO other = (TemaIndicadorInstrumentoDTO) obj;
		if (idTemaIndicadorInstru == null) {
			if (other.idTemaIndicadorInstru != null)
				return false;
		} else if (!idTemaIndicadorInstru.equals(other.idTemaIndicadorInstru))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TemaIndicadorInstrumentoDTO [idTemaIndicadorInstru=" + idTemaIndicadorInstru + ", temaIndicador="
				+ temaIndicador + ", temaInstruEval=" + temaInstruEval + ", idUsuario=" + idUsuario + "]";
	}

	
	
}
