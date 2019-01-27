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
@Table(name="RUBRICA")
public class Rubrica extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_RUBRICA")
	private Integer idRubrica;
	
	@ManyToOne
	@JoinColumn(name = "ID_INDICADOR_FK")
	private Indicador indicador;
	
	@Column(name="NOTA")
	private Integer nota;
	
	
	@Column(name="DS_DESCRIPCION")
	private String descripcion;
	
	@Column(name="ID_USUARIO")
	private String idUsuario;

	public Integer getIdRubrica() {
		return idRubrica;
	}

	public void setIdRubrica(Integer idRubrica) {
		this.idRubrica = idRubrica;
	}

	public Indicador getIndicador() {
		return indicador;
	}

	public void setIndicador(Indicador indicador) {
		this.indicador = indicador;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
		result = prime * result + ((idRubrica == null) ? 0 : idRubrica.hashCode());
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
		Rubrica other = (Rubrica) obj;
		if (idRubrica == null) {
			if (other.idRubrica != null)
				return false;
		} else if (!idRubrica.equals(other.idRubrica))
			return false;
		return true;
	}	


}
