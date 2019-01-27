package es.binarycode.gesclas;

import org.apache.commons.collections4.IterableUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.binarycode.gesclas.repository.TipoClaseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TipoClaseRepoTest {

	@Autowired
	TipoClaseRepository tipoClaseDao;


	@Test
	public void getFind() {
		Assert.assertEquals(2, IterableUtils.toList(tipoClaseDao.findAll()).size());
	} 
	
	
}
