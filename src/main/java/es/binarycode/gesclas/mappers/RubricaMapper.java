package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.RubricaDTO;
import es.binarycode.gesclas.entity.Rubrica;

@Mapper(componentModel="spring")
public interface RubricaMapper extends GenericMapper<RubricaDTO, Rubrica>{
	RubricaMapper INSTANCE = Mappers.getMapper( RubricaMapper.class );
    
	RubricaDTO entityToDTO(Rubrica driver); 
	Rubrica dtoToEntity(RubricaDTO driver); 
    List<RubricaDTO> listToDTOList(List<Rubrica> source);
}
