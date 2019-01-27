package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.DriverDTO;
import es.binarycode.gesclas.dto.UserDTO;
import es.binarycode.gesclas.entity.Driver;
import es.binarycode.gesclas.entity.User;

@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );
    
	UserDTO entityToDTO(User source); 
	User dtoToEntity(UserDTO source); 
    List<UserDTO> listToDTOList(List<User> source);
}
