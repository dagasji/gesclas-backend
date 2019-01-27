package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.AlumnoDTO;
import es.binarycode.gesclas.entity.Alumno;
import es.binarycode.gesclas.mappers.AlumnoMapper;
import es.binarycode.gesclas.mappers.GenericMapper;

@Service
public class AlumnoServiceImpl extends GeneralServiceImpl<AlumnoDTO, Alumno> 
	implements AlumnoService{

	@Override
	public GenericMapper<AlumnoDTO, Alumno> getMapper() {
		
		return AlumnoMapper.INSTANCE;
	}
	
	
}
