package es.binarycode.gesclas.services;

import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.binarycode.gesclas.dto.ClaseDTO;
import es.binarycode.gesclas.entity.Clase;
import es.binarycode.gesclas.mappers.ClaseMapper;
import es.binarycode.gesclas.mappers.GenericMapper;
import es.binarycode.gesclas.repository.ClaseRepository;

@Service
public class ClaseServiceImpl extends GeneralServiceImpl<ClaseDTO, Clase> 
	implements ClaseService{
	
	@Autowired
	private ClaseRepository repo;

	@Override
	public GenericMapper<ClaseDTO, Clase> getMapper() {
		
		return ClaseMapper.INSTANCE;
	}
	
	@Override
	public List<ClaseDTO> findByUser(Integer idUsuario) {
		
		List<Clase> list = IterableUtils.toList(repo.findByidUsuario(idUsuario));
		
		List<ClaseDTO> listaDTO = this.getMapper().listToDTOList(list);
		
		return listaDTO;
	}
	
	
	
}
