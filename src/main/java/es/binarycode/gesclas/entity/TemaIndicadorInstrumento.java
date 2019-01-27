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
@Table(name="TEMA_INDICADOR_INSTRU")
public class TemaIndicadorInstrumento extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TEMA_INDICADOR_INSTRU")
	private Integer idTemaIndicadorInstru;
	
	@ManyToOne
	@JoinColumn(name = "ID_TEMA_INDICADOR")
	private TemaIndicador temaIndicador;
	
	@ManyToOne
	@JoinColumn(name = "ID_TEMA_INSTRU_EVAL")
	private TemaInstruEval temaInstruEval;
	
	@Column(name="ID_USUARIO")
	private String idUsuario;

	public Integer getIdTemaIndicadorInstru() {
		return idTemaIndicadorInstru;
	}

	public void setIdTemaIndicadorInstru(Integer idTemaIndicadorInstru) {
		this.idTemaIndicadorInstru = idTemaIndicadorInstru;
	}

	public TemaIndicador getTemaIndicador() {
		return temaIndicador;
	}

	public void setTemaIndicador(TemaIndicador temaIndicador) {
		this.temaIndicador = temaIndicador;
	}

	public TemaInstruEval getTemaInstruEval() {
		return temaInstruEval;
	}

	public void setTemaInstruEval(TemaInstruEval temaInstruEval) {
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
		TemaIndicadorInstrumento other = (TemaIndicadorInstrumento) obj;
		if (idTemaIndicadorInstru == null) {
			if (other.idTemaIndicadorInstru != null)
				return false;
		} else if (!idTemaIndicadorInstru.equals(other.idTemaIndicadorInstru))
			return false;
		return true;
	}

	
	
}
