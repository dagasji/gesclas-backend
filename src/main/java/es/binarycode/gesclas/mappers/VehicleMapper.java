package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.VehicleDTO;
import es.binarycode.gesclas.entity.Vehicle;

@Mapper(uses=DateMapper.class)
public interface VehicleMapper {
	VehicleMapper INSTANCE = Mappers.getMapper( VehicleMapper.class );
    
	VehicleDTO entityToDTO(Vehicle user); 
	Vehicle dtoToEntity(VehicleDTO user); 
    List<VehicleDTO> listToDTOList(List<Vehicle> source);
}
