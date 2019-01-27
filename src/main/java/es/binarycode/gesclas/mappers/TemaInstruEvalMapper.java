package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.TemaInstruEvalDTO;
import es.binarycode.gesclas.entity.TemaInstruEval;

@Mapper(componentModel="spring")
public interface TemaInstruEvalMapper {
	TemaInstruEvalMapper INSTANCE = Mappers.getMapper( TemaInstruEvalMapper.class );
    
	TemaInstruEvalDTO entityToDTO(TemaInstruEval driver); 
	TemaInstruEval dtoToEntity(TemaInstruEvalDTO driver); 
    List<TemaInstruEvalDTO> listToDTOList(List<TemaInstruEval> source);
}
