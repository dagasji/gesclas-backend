package es.binarycode.gesclas.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import es.binarycode.gesclas.Application;
import es.binarycode.gesclas.dto.ClaseDTO;
import es.binarycode.gesclas.services.ClaseService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class ClaseServiceTest {

	@Autowired
	private ClaseService claseService;


	@Test 
	public void testFindById() {
		
		List<ClaseDTO> listaClases =claseService.findByUser(1);
		System.out.println(listaClases.size());
	} 
	

		
	
}
