package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.TipoClaseDTO;
import es.binarycode.gesclas.entity.TipoClase;
import es.binarycode.gesclas.mappers.GenericMapper;
import es.binarycode.gesclas.mappers.TipoClaseMapper;

@Service
public class TipoClaseServiceImpl extends GeneralServiceImpl<TipoClaseDTO, TipoClase> 
	implements TipoClaseService{

	@Override
	public GenericMapper<TipoClaseDTO, TipoClase> getMapper() {
		
		return TipoClaseMapper.INSTANCE;
	}
	
	
}
