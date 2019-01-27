package es.binarycode.gesclas.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.binarycode.gesclas.dto.EntryDTO;
import es.binarycode.gesclas.entity.Entry;

@Mapper(uses=DateMapper.class)
public interface EntryMapper {
	EntryMapper INSTANCE = Mappers.getMapper( EntryMapper.class );
    
	EntryDTO entityToDTO(Entry source); 
	Entry dtoToEntity(EntryDTO source); 
    List<EntryDTO> listToDTOList(List<Entry> source);
}
