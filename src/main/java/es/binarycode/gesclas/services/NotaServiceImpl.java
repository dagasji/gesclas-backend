package es.binarycode.gesclas.services;

import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.NotaDTO;
import es.binarycode.gesclas.entity.Nota;
import es.binarycode.gesclas.mappers.GenericMapper;
import es.binarycode.gesclas.mappers.NotaMapper;

@Service
public class NotaServiceImpl extends GeneralServiceImpl<NotaDTO, Nota> 
	implements NotaService{

	@Override
	public GenericMapper<NotaDTO, Nota> getMapper() {
		
		return NotaMapper.INSTANCE;
	}
	
	
}
