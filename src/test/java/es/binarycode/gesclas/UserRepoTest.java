package es.binarycode.gesclas;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.binarycode.gesclas.Application;
import es.binarycode.gesclas.entity.User;
import es.binarycode.gesclas.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserRepoTest {

	@Autowired 
	UserRepository userDao;

	@Test
	@Transactional
	public void getUser() {
		User user = userDao.findById("konum").get();
		Assert.assertEquals("Guillermo Gefaell", user.getName());
	} 

}
