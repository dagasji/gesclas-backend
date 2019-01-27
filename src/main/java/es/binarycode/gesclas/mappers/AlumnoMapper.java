package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.AlumnoDTO;
import es.binarycode.gesclas.entity.Alumno;

@Mapper(componentModel="spring")
public interface AlumnoMapper {
	AlumnoMapper INSTANCE = Mappers.getMapper( AlumnoMapper.class );
    
	AlumnoDTO entityToDTO(Alumno driver); 
	Alumno dtoToEntity(AlumnoDTO driver); 
    List<AlumnoDTO> listToDTOList(List<Alumno> source);
}
