package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.TemaIndicadorInstrumentoDTO;
import es.binarycode.gesclas.entity.TemaIndicadorInstrumento;
import es.binarycode.gesclas.mappers.GenericMapper;
import es.binarycode.gesclas.mappers.TemaIndicadorInstrumentoMapper;

@Service
public class TemaIndicadorInstrumentoServiceImpl extends GeneralServiceImpl<TemaIndicadorInstrumentoDTO, TemaIndicadorInstrumento> 
	implements TemaIndicadorInstrumentoService{

	@Override
	public GenericMapper<TemaIndicadorInstrumentoDTO, TemaIndicadorInstrumento> getMapper() {
		
		return TemaIndicadorInstrumentoMapper.INSTANCE;
	}
	
	
}
