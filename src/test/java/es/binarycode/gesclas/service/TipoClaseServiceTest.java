package es.binarycode.gesclas.service;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import es.binarycode.gesclas.Application;
import es.binarycode.gesclas.dto.TipoClaseDTO;
import es.binarycode.gesclas.services.TipoClaseService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class TipoClaseServiceTest {
	
	private static final Logger logger = LoggerFactory.getLogger(TipoClaseServiceTest.class);

	@Autowired
	private TipoClaseService tipoClaseService;


	@Test 
	public void testFindById() {
		TipoClaseDTO tipoClase = tipoClaseService.findById(1);
		logger.info(tipoClase.toString());
		Assert.assertEquals("Primaria", tipoClase.getTipoClase());
	} 
	
	@Test
	public void testFindAll() {
		Assert.assertEquals(2, tipoClaseService.findAll().size());
	} 
	
	@Test
	public void testAddTipoClase() {
		
		TipoClaseDTO tipoClase = new TipoClaseDTO();
		tipoClase.setTipoClase("Prueba");
		tipoClase.setFechaAlta(new Date());
		 
		Integer numTipoClase = tipoClaseService.findAll().size();
		
		tipoClaseService.create(tipoClase);
		 
		
		Assert.assertEquals(numTipoClase + 1, tipoClaseService.findAll().size());
	} 
		
	
}
