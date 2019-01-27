package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.ClaseDTO;
import es.binarycode.gesclas.entity.Clase;

@Mapper(componentModel="spring")
public interface ClaseMapper {
	ClaseMapper INSTANCE = Mappers.getMapper( ClaseMapper.class );
    
	ClaseDTO entityToDTO(Clase driver); 
	Clase dtoToEntity(ClaseDTO driver); 
    List<ClaseDTO> listToDTOList(List<Clase> source);
}
