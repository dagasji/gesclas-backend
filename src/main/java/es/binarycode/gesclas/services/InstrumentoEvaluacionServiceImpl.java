package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.InstrumentoEvaluacionDTO;
import es.binarycode.gesclas.entity.InstrumentoEvaluacion;
import es.binarycode.gesclas.mappers.GenericMapper;
import es.binarycode.gesclas.mappers.InstrumentoEvaluacionMapper;

@Service
public class InstrumentoEvaluacionServiceImpl extends GeneralServiceImpl<InstrumentoEvaluacionDTO, InstrumentoEvaluacion> 
	implements InstrumentoEvaluacionService{

	@Override
	public GenericMapper<InstrumentoEvaluacionDTO, InstrumentoEvaluacion> getMapper() {
		
		return InstrumentoEvaluacionMapper.INSTANCE;
	}
	
	
}
