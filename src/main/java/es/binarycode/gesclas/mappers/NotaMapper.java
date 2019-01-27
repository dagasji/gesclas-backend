package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.NotaDTO;
import es.binarycode.gesclas.entity.Nota;

@Mapper(componentModel="spring")
public interface NotaMapper extends GenericMapper<NotaDTO, Nota>{
	
	NotaMapper INSTANCE = Mappers.getMapper( NotaMapper.class );
    
	NotaDTO entityToDTO(Nota driver); 
	Nota dtoToEntity(NotaDTO driver); 
    List<NotaDTO> listToDTOList(List<Nota> source);
}
