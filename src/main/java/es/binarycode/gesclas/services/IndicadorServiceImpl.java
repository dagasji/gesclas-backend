package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.IndicadorDTO;
import es.binarycode.gesclas.entity.Indicador;
import es.binarycode.gesclas.mappers.GenericMapper;
import es.binarycode.gesclas.mappers.IndicadorMapper;

@Service
public class IndicadorServiceImpl extends GeneralServiceImpl<IndicadorDTO, Indicador> 
	implements IndicadorService{

	@Override
	public GenericMapper<IndicadorDTO, Indicador> getMapper() {
		
		return IndicadorMapper.INSTANCE;
	}
	
	
}
