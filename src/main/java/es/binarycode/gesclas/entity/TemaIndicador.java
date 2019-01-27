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
@Table(name="TEMA_INDICADOR")
public class TemaIndicador extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TEMA_INDICADOR")
	private Integer idTemaIndicador;
	
	@ManyToOne
	@JoinColumn(name = "ID_TEMA_FK")
	private Tema tema;
	
	@ManyToOne
	@JoinColumn(name = "ID_INDICADOR_FK")
	private Indicador indicador;
	
	@Column(name="ID_USUARIO")
	private String idUsuario;
	
	@Column(name="NM_PONDERACION")
	private Float ponderacion;

	public Integer getIdTemaIndicador() {
		return idTemaIndicador;
	}

	public void setIdTemaIndicador(Integer idTemaIndicador) {
		this.idTemaIndicador = idTemaIndicador;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Indicador getIndicador() {
		return indicador;
	}

	public void setIndicador(Indicador indicador) {
		this.indicador = indicador;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Float getPonderacion() {
		return ponderacion;
	}

	public void setPonderacion(Float ponderacion) {
		this.ponderacion = ponderacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTemaIndicador == null) ? 0 : idTemaIndicador.hashCode());
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
		TemaIndicador other = (TemaIndicador) obj;
		if (idTemaIndicador == null) {
			if (other.idTemaIndicador != null)
				return false;
		} else if (!idTemaIndicador.equals(other.idTemaIndicador))
			return false;
		return true;
	}

	
}
