package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.TemaIndicadorDTO;
import es.binarycode.gesclas.entity.TemaIndicador;

@Mapper(componentModel="spring")
public interface TemaIndicadorMapper {
	TemaIndicadorMapper INSTANCE = Mappers.getMapper( TemaIndicadorMapper.class );
    
	TemaIndicadorDTO entityToDTO(TemaIndicador driver); 
	TemaIndicador dtoToEntity(TemaIndicadorDTO driver); 
    List<TemaIndicadorDTO> listToDTOList(List<TemaIndicador> source);
}
