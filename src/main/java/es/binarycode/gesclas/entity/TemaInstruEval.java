package es.binarycode.gesclas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TEMA_INSTRU_EVAL")
public class TemaInstruEval extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TEMA_INSTRU_EVAL")
	private Integer idTemaInstruEval;
	
	@ManyToOne
	@JoinColumn(name = "ID_TEMA_FK")
	private Tema tema;
	
	@ManyToOne
	@JoinColumn(name = "ID_INSTRUMENTO_EVALUACION_FK")
	private InstrumentoEvaluacion instrumentoEvaluacion;
		
	@Column(name="NM_PONDERACION")
	private Float ponderacion;
	
	@Column(name="ID_USUARIO")
	private String idUsuario;

	public Integer getIdTemaInstruEval() {
		return idTemaInstruEval;
	}

	public void setIdTemaInstruEval(Integer idTemaInstruEval) {
		this.idTemaInstruEval = idTemaInstruEval;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public InstrumentoEvaluacion getInstrumentoEvaluacion() {
		return instrumentoEvaluacion;
	}

	public void setInstrumentoEvaluacion(InstrumentoEvaluacion instrumentoEvaluacion) {
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
		TemaInstruEval other = (TemaInstruEval) obj;
		if (idTemaInstruEval == null) {
			if (other.idTemaInstruEval != null)
				return false;
		} else if (!idTemaInstruEval.equals(other.idTemaInstruEval))
			return false;
		return true;
	}

	
	
}
