package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.TipoClaseDTO;
import es.binarycode.gesclas.entity.TipoClase;

@Mapper(componentModel="spring")
public interface TipoClaseMapper extends GenericMapper<TipoClaseDTO, TipoClase> {
	TipoClaseMapper INSTANCE = Mappers.getMapper( TipoClaseMapper.class );
    
	TipoClaseDTO entityToDTO(TipoClase driver); 
	TipoClase dtoToEntity(TipoClaseDTO driver); 
    List<TipoClaseDTO> listToDTOList(List<TipoClase> source);
}
