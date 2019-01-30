package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.TemaDTO;
import es.binarycode.gesclas.entity.Tema;
import es.binarycode.gesclas.mappers.GenericMapper;
import es.binarycode.gesclas.mappers.TemaMapper;

@Service
public class TemaServiceImpl extends GeneralServiceImpl<TemaDTO, Tema> 
	implements TemaService{

	@Override
	public GenericMapper<TemaDTO, Tema> getMapper() {
		
		return TemaMapper.INSTANCE;
	}
	
	
}
