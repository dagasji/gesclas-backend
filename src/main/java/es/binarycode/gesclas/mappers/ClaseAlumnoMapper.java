package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.ClaseAlumnoDTO;
import es.binarycode.gesclas.entity.ClaseAlumno;

@Mapper(componentModel="spring")
public interface ClaseAlumnoMapper {
	ClaseAlumnoMapper INSTANCE = Mappers.getMapper( ClaseAlumnoMapper.class );
    
	ClaseAlumnoDTO entityToDTO(ClaseAlumno driver); 
	ClaseAlumno dtoToEntity(ClaseAlumnoDTO driver); 
    List<ClaseAlumnoDTO> listToDTOList(List<ClaseAlumno> source);
}
