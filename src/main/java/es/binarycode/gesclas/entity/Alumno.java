package es.binarycode.gesclas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ALUMNO")
public class Alumno extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ALUMNO")
	private Integer idAlumno;
	
	@Column(name="DS_NOMBRE")
	private String nombre;
	
	@Column(name="DS_APELLIDOS")
	private String apellidos;
	
	@Column(name="DS_CONTACTO_1")
	private String nombreContacto1;
	
	@Column(name="DS_CONTACTO_2")
	private String nombreContacto2;
	
	@Column(name="DS_TELEFONO_CONTACTO_1")
	private String telefonoContacto1;
	
	@Column(name="DS_TELEFONO_CONTACTO_2")
	private String telefonoContacto2;
	
	@Column(name="ID_USUARIO")
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
		Alumno other = (Alumno) obj;
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
	
	
}
