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
public class Nota extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_NOTA")
	private Integer idNota;
	
	@ManyToOne
	@JoinColumn(name = "ID_TEMA_INDICADOR_INSTRU")
	private TemaIndicadorInstrumento temaIndicadorInstrumento;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLASE_ALUMNO")
	private ClaseAlumno claseAlumno;
		
	@Column(name="NOTA")
	private Float nota;
	
	@Column(name="ID_USUARIO")
	private String idUsuario;

	public Integer getIdNota() {
		return idNota;
	}

	public void setIdNota(Integer idNota) {
		this.idNota = idNota;
	}

	public TemaIndicadorInstrumento getTemaIndicadorInstrumento() {
		return temaIndicadorInstrumento;
	}

	public void setTemaIndicadorInstrumento(TemaIndicadorInstrumento temaIndicadorInstrumento) {
		this.temaIndicadorInstrumento = temaIndicadorInstrumento;
	}

	public ClaseAlumno getClaseAlumno() {
		return claseAlumno;
	}

	public void setClaseAlumno(ClaseAlumno claseAlumno) {
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
		Nota other = (Nota) obj;
		if (idNota == null) {
			if (other.idNota != null)
				return false;
		} else if (!idNota.equals(other.idNota))
			return false;
		return true;
	}


	
}
