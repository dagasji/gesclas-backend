package es.binarycode.gesclas.controllers;

import java.security.Principal;
import java.util.List;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.binarycode.gesclas.dto.DriverDTO;
import es.binarycode.gesclas.entity.Driver;
import es.binarycode.gesclas.mappers.DriverMapper;
import es.binarycode.gesclas.repository.DriverRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/private/driver")
public class DriverController {
	
	@Autowired
	private DriverRepository driverRepo;
	

	@RequestMapping("/detail/{rut}")
	public DriverDTO getByRut(@PathVariable("rut") Integer rut) {
		Driver driver = driverRepo.findById(rut).get();
		DriverMapper mapper = DriverMapper.INSTANCE;
		return 	mapper.entityToDTO(driver);
	}
   
   
  	@RequestMapping("/listAll")
  	public List<DriverDTO> getAll(@AuthenticationPrincipal Principal principal) {
  		return DriverMapper.INSTANCE.listToDTOList(IterableUtils.toList(driverRepo.findAll()));
  	}

	public void save(@RequestBody DriverDTO driver) {
		driverRepo.save(DriverMapper.INSTANCE.dtoToEntity(driver));
	}
	
}
