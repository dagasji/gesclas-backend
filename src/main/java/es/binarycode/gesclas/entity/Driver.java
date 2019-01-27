package es.binarycode.gesclas.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Driver {
	
	@Id	
	private Integer rut;
	
	@Column
	private String name;
	
	@Transient
	private Date licenseExpireDate;
	
	
	
	//permisos de conductor por rango de fechas.
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Driver [rut=");
		builder.append(rut);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rut == null) ? 0 : rut.hashCode());
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
		Driver other = (Driver) obj;
		if (rut == null) {
			if (other.rut != null)
				return false;
		} else if (!rut.equals(other.rut))
			return false;
		return true;
	}

	public Date getLicenseExpireDate() {
		return licenseExpireDate;
	}

	public void setLicenseExpireDate(Date licenseExpireDate) {
		this.licenseExpireDate = licenseExpireDate;
	}

	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
