package es.binarycode.gesclas;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.binarycode.gesclas.dto.TipoClaseDTO;
import es.binarycode.gesclas.services.TipoClaseService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TipoClaseServiceTest {

	@Autowired
	TipoClaseService tipoClaseService;


	@Test
	public void getFindId() {
		Assert.assertEquals("Primaria", tipoClaseService.findById(1).getTipoClase());
	} 
	
	@Test
	public void getFindAll() {
		Assert.assertEquals(2, tipoClaseService.findAll().size());
	} 
	
	@Test
	public void getAddTipoClase() {
		
		TipoClaseDTO tipoClase = new TipoClaseDTO();
		tipoClase.setTipoClase("Prueba");
		tipoClase.setFechaAlta(new Date());
		 
		Integer numTipoClase = tipoClaseService.findAll().size();
		
		tipoClaseService.create(tipoClase);
		 
		
		Assert.assertEquals(numTipoClase + 1, tipoClaseService.findAll().size());
	} 
		
	
}
