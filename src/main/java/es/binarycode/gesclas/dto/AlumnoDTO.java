package es.binarycode.gesclas.dto;

public class AlumnoDTO extends GenericDTO {
	
	
	private Integer idAlumno;

	private String nombre;

	private String apellidos;

	private String nombreContacto1;

	private String nombreContacto2;

	private String telefonoContacto1;

	private String telefonoContacto2;

	private String idUsuario;
	

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombreContacto1() {
		return nombreContacto1;
	}

	public void setNombreContacto1(String nombreContacto1) {
		this.nombreContacto1 = nombreContacto1;
	}

	public String getNombreContacto2() {
		return nombreContacto2;
	}

	public void setNombreContacto2(String nombreContacto2) {
		this.nombreContacto2 = nombreContacto2;
	}

	public String getTelefonoContacto1() {
		return telefonoContacto1;
	}

	public void setTelefonoContacto1(String telefonoContacto1) {
		this.telefonoContacto1 = telefonoContacto1;
	}

	public String getTelefonoContacto2() {
		return telefonoContacto2;
	}

	public void setTelefonoContacto2(String telefonoContacto2) {
		this.telefonoContacto2 = telefonoContacto2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAlumno == null) ? 0 : idAlumno.hashCode());
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
		AlumnoDTO other = (AlumnoDTO) obj;
		if (idAlumno == null) {
			if (other.idAlumno != null)
				return false;
		} else if (!idAlumno.equals(other.idAlumno))
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
		return "AlumnoDTO [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", nombreContacto1=" + nombreContacto1 + ", nombreContacto2=" + nombreContacto2
				+ ", telefonoContacto1=" + telefonoContacto1 + ", telefonoContacto2=" + telefonoContacto2
				+ ", idUsuario=" + idUsuario + "]";
	}
	
	
	
	
}
