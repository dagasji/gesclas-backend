package es.binarycode.gesclas;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.binarycode.gesclas.repository.ClaseRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ClaseRepoTest {

	@Autowired
	ClaseRepository claseDao;


	@Test
	public void getFind() {
		Assert.assertEquals("1º A", this.claseDao.findById(1).get().getDescripcion());
	} 
	
	
}
