package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface GenericMapper<E, T> {
	GenericMapper INSTANCE = Mappers.getMapper( GenericMapper.class );
    
	abstract E entityToDTO(T entity); 
	abstract T dtoToEntity(E driver); 
    abstract List<E> listToDTOList(List<T> source);
}
