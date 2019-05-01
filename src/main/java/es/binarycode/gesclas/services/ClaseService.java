package es.binarycode.gesclas.services;

import java.util.List;

import es.binarycode.gesclas.dto.ClaseDTO;
import es.binarycode.gesclas.entity.Clase;

public interface ClaseService extends GeneralService<ClaseDTO, Clase>{
	
	List<ClaseDTO> findByUser(Integer idUsuario); 

}
