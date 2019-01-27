package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.ClaseAlumnoDTO;
import es.binarycode.gesclas.entity.ClaseAlumno;
import es.binarycode.gesclas.mappers.ClaseAlumnoMapper;
import es.binarycode.gesclas.mappers.GenericMapper;

@Service
public class ClaseAlumnoServiceImpl extends GeneralServiceImpl<ClaseAlumnoDTO, ClaseAlumno> 
	implements ClaseAlumnoService{

	@Override
	public GenericMapper<ClaseAlumnoDTO, ClaseAlumno> getMapper() {
		
		return ClaseAlumnoMapper.INSTANCE;
	}
	
	
}
