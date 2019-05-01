package es.binarycode.gesclas.service;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import es.binarycode.gesclas.Application;
import es.binarycode.gesclas.dto.TipoClaseDTO;
import es.binarycode.gesclas.services.TipoClaseService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class PasswordEncoderTest {
	
	private static final Logger logger = LoggerFactory.getLogger(PasswordEncoderTest.class);

	@Autowired
	private PasswordEncoder passwordEncoder;


	@Test 
	public void testEncodePassword() {

		String pass = passwordEncoder.encode("1234");
		logger.info("Pass codificada: " + pass);
		
	} 
	
		
	
}
