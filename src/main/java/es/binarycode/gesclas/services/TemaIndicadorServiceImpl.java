package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.TemaIndicadorDTO;
import es.binarycode.gesclas.entity.TemaIndicador;
import es.binarycode.gesclas.mappers.GenericMapper;
import es.binarycode.gesclas.mappers.TemaIndicadorMapper;

@Service
public class TemaIndicadorServiceImpl extends GeneralServiceImpl<TemaIndicadorDTO, TemaIndicador> 
	implements TemaIndicadorService{

	@Override
	public GenericMapper<TemaIndicadorDTO, TemaIndicador> getMapper() {
		
		return TemaIndicadorMapper.INSTANCE;
	}
	
	
}
