package es.binarycode.gesclas.dto;

public class TemaInstruEvalDTO extends GenericDTO {
	
	private Integer idTemaInstruEval;
	
	private TemaDTO tema;
	
	private InstrumentoEvaluacionDTO instrumentoEvaluacion;
		
	private Float ponderacion;
	
	private String idUsuario;

	public Integer getIdTemaInstruEval() {
		return idTemaInstruEval;
	}

	public void setIdTemaInstruEval(Integer idTemaInstruEval) {
		this.idTemaInstruEval = idTemaInstruEval;
	}

	public TemaDTO getTema() {
		return tema;
	}

	public void setTema(TemaDTO tema) {
		this.tema = tema;
	}

	public InstrumentoEvaluacionDTO getInstrumentoEvaluacion() {
		return instrumentoEvaluacion;
	}

	public void setInstrumentoEvaluacion(InstrumentoEvaluacionDTO instrumentoEvaluacion) {
		this.instrumentoEvaluacion = instrumentoEvaluacion;
	}

	public Float getPonderacion() {
		return ponderacion;
	}

	public void setPonderacion(Float ponderacion) {
		this.ponderacion = ponderacion;
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
		result = prime * result + ((idTemaInstruEval == null) ? 0 : idTemaInstruEval.hashCode());
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
		TemaInstruEvalDTO other = (TemaInstruEvalDTO) obj;
		if (idTemaInstruEval == null) {
			if (other.idTemaInstruEval != null)
				return false;
		} else if (!idTemaInstruEval.equals(other.idTemaInstruEval))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TemaInstruEvalDTO [idTemaInstruEval=" + idTemaInstruEval + ", tema=" + tema + ", instrumentoEvaluacion="
				+ instrumentoEvaluacion + ", ponderacion=" + ponderacion + ", idUsuario=" + idUsuario + "]";
	}

	
}
