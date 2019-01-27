package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.IndicadorDTO;
import es.binarycode.gesclas.dto.InstrumentoEvaluacionDTO;
import es.binarycode.gesclas.entity.Indicador;
import es.binarycode.gesclas.entity.InstrumentoEvaluacion;

@Mapper(componentModel="spring")
public interface InstrumentoEvaluacionMapper extends 
	GenericMapper<InstrumentoEvaluacionDTO, InstrumentoEvaluacion>{
	
	InstrumentoEvaluacionMapper INSTANCE = Mappers.getMapper( InstrumentoEvaluacionMapper.class );
    
	InstrumentoEvaluacionDTO entityToDTO(InstrumentoEvaluacion driver); 
	Indicador dtoToEntity(IndicadorDTO driver); 
    List<InstrumentoEvaluacionDTO> listToDTOList(List<InstrumentoEvaluacion> source);
}
