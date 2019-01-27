package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.DriverDTO;
import es.binarycode.gesclas.entity.Driver;

@Mapper(componentModel="spring")
public interface DriverMapper {
	DriverMapper INSTANCE = Mappers.getMapper( DriverMapper.class );
    
	DriverDTO entityToDTO(Driver driver); 
	Driver dtoToEntity(DriverDTO driver); 
    List<DriverDTO> listToDTOList(List<Driver> source);
}
