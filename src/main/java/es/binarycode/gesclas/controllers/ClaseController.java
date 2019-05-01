package es.binarycode.gesclas.controllers;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.binarycode.gesclas.dto.TipoClaseDTO;
import es.binarycode.gesclas.dto.UserDTO;
import es.binarycode.gesclas.services.ClaseService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/private/clase")
public class ClaseController {

	private static final Logger logger = LoggerFactory.getLogger(ClaseController.class);
	
	@Autowired
	private ClaseService claseService;


  	@RequestMapping(value="/listAll", method=RequestMethod.GET)
  	public List<TipoClaseDTO> getAll(
  			@AuthenticationPrincipal UsernamePasswordAuthenticationToken principal) {
  		if (logger.isDebugEnabled()) {
			logger.debug("getAll() - start");
		}
  		
  		UserDTO user = (UserDTO) principal.getPrincipal();
  		//List<TipoClaseDTO> returnList = claseService.findByUser(idUsuario)indAll();;
  		List<TipoClaseDTO> returnList = null;
  		
		if (logger.isDebugEnabled()) {
			logger.debug("getAll() - end - return value={}", returnList);
		}
		return returnList; 
  	}


	public ClaseService getClaseService() {
		return claseService;
	}


	public void setClaseService(ClaseService claseService) {
		this.claseService = claseService;
	}
  	
  	
 



}
