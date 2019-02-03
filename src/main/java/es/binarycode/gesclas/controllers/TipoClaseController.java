package es.binarycode.gesclas.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.binarycode.gesclas.dto.TipoClaseDTO;
import es.binarycode.gesclas.services.TipoClaseService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/public/tipoclase")
public class TipoClaseController {

	private static final Logger logger = LoggerFactory.getLogger(TipoClaseController.class);
	
	@Autowired
	private TipoClaseService tipoClaseService;


  	@RequestMapping(value="/listAll", method=RequestMethod.GET)
  	public List<TipoClaseDTO> getAll() {
  		if (logger.isDebugEnabled()) {
			logger.debug("getAll() - start");
		}

  		List<TipoClaseDTO> returnList = tipoClaseService.findAll();;
  		
		if (logger.isDebugEnabled()) {
			logger.debug("getAll() - end - return value={}", returnList);
		}
		return returnList; 
  	}
  	
  	
 


	public TipoClaseService getTipoClaseService() {
		return tipoClaseService;
	}


	public void setTipoClaseService(TipoClaseService tipoClaseService) {
		this.tipoClaseService = tipoClaseService;
	}
}
