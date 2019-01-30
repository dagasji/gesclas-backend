package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.RubricaDTO;
import es.binarycode.gesclas.entity.Rubrica;
import es.binarycode.gesclas.mappers.GenericMapper;
import es.binarycode.gesclas.mappers.RubricaMapper;

@Service
public class RubricaServiceImpl extends GeneralServiceImpl<RubricaDTO, Rubrica> 
	implements RubricaService{

	@Override
	public GenericMapper<RubricaDTO, Rubrica> getMapper() {
		
		return RubricaMapper.INSTANCE;
	}
	
	
}
