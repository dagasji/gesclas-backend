package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.TemaIndicadorInstrumentoDTO;
import es.binarycode.gesclas.entity.TemaIndicadorInstrumento;

@Mapper(componentModel="spring")
public interface TemaIndicadorInstrumentoMapper {
	TemaIndicadorInstrumentoMapper INSTANCE = Mappers.getMapper( TemaIndicadorInstrumentoMapper.class );
    
	TemaIndicadorInstrumentoDTO entityToDTO(TemaIndicadorInstrumento driver); 
	TemaIndicadorInstrumento dtoToEntity(TemaIndicadorInstrumentoDTO driver); 
    List<TemaIndicadorInstrumentoDTO> listToDTOList(List<TemaIndicadorInstrumento> source);
}
