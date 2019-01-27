package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.IndicadorDTO;
import es.binarycode.gesclas.entity.Indicador;

@Mapper(componentModel="spring")
public interface InstrumentoEvaluacionMapper {
	InstrumentoEvaluacionMapper INSTANCE = Mappers.getMapper( InstrumentoEvaluacionMapper.class );
    
	IndicadorDTO entityToDTO(Indicador driver); 
	Indicador dtoToEntity(IndicadorDTO driver); 
    List<IndicadorDTO> listToDTOList(List<Indicador> source);
}
