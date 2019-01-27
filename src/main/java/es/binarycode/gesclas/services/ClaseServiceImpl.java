package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.ClaseDTO;
import es.binarycode.gesclas.entity.Clase;
import es.binarycode.gesclas.mappers.ClaseMapper;
import es.binarycode.gesclas.mappers.GenericMapper;

@Service
public class ClaseServiceImpl extends GeneralServiceImpl<ClaseDTO, Clase> 
	implements ClaseService{

	@Override
	public GenericMapper<ClaseDTO, Clase> getMapper() {
		
		return ClaseMapper.INSTANCE;
	}
	
	
}
