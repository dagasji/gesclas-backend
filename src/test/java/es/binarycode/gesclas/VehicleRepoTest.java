package es.binarycode.gesclas;

import org.apache.commons.collections4.IterableUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.binarycode.gesclas.Application;
import es.binarycode.gesclas.repository.VehicleRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class VehicleRepoTest {

	@Autowired
	VehicleRepository vehicleDao;


	@Test
	public void getOnRepiar() {
		Assert.assertEquals("LAKN-55", vehicleDao.findByOnRepair(true).iterator().next().getPlate());
	} 
	
	@Test
	public void getNotOnRepair() {
		Assert.assertEquals(3, IterableUtils.toList(vehicleDao.findByOnRepair(false)).size());
	}
	
	@Test
	public void getFindByGas() {
		Assert.assertEquals(3, IterableUtils.toList(vehicleDao.findByGas("gasolina")).size());
	}
}
