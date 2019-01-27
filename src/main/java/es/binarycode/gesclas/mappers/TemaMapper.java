package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.TemaDTO;
import es.binarycode.gesclas.entity.Tema;

@Mapper(componentModel="spring")
public interface TemaMapper extends GenericMapper<TemaDTO, Tema> {
	TemaMapper INSTANCE = Mappers.getMapper( TemaMapper.class );
    
	TemaDTO entityToDTO(Tema driver); 
	Tema dtoToEntity(TemaDTO driver); 
    List<TemaDTO> listToDTOList(List<Tema> source);
}
