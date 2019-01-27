package es.binarycode.gesclas.dto;

public class ClaseAlumnoDTO extends GenericDTO {
	

	private Integer idClaseAlumno;

	private ClaseDTO clase;
	
	private AlumnoDTO alumno;
	
	private String idUsuario;



	public ClaseDTO getClase() {
		return clase;
	}

	public void setClase(ClaseDTO clase) {
		this.clase = clase;
	}

	public AlumnoDTO getAlumno() {
		return alumno;
	}

	public void setAlumno(AlumnoDTO alumno) {
		this.alumno = alumno;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdClaseAlumno() {
		return idClaseAlumno;
	}

	public void setIdClaseAlumno(Integer idClaseAlumno) {
		this.idClaseAlumno = idClaseAlumno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClaseAlumno == null) ? 0 : idClaseAlumno.hashCode());
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
		ClaseAlumnoDTO other = (ClaseAlumnoDTO) obj;
		if (idClaseAlumno == null) {
			if (other.idClaseAlumno != null)
				return false;
		} else if (!idClaseAlumno.equals(other.idClaseAlumno))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClaseAlumnoDTO [idClaseAlumno=" + idClaseAlumno + ", clase=" + clase + ", alumno=" + alumno
				+ ", idUsuario=" + idUsuario + "]";
	}


		
}
