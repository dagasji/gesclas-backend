package es.binarycode.gesclas;


import java.util.List;
import java.util.TimeZone;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.binarycode.gesclas.Application;
import es.binarycode.gesclas.controllers.VehicleController;
import es.binarycode.gesclas.dto.EntryDTO;
import es.binarycode.gesclas.dto.VehicleDTO;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class VehicleControllerTest {

	@Autowired
	VehicleController rest;
	
	 
	@Test
	public void testGetByPlate() {
		VehicleDTO dto = rest.getByPlate("FYJA-44");
		Assert.assertEquals("gasolina", dto.getGas());
	}

	@Test
	@Transactional
	public void testDeleteByPlate() {
		rest.deleteByPlate("FYJA-44");
		VehicleDTO dto = rest.getByPlate("FYJA-44");
		Assert.assertNull(dto);
	}

	@Test
	public void testGetAll() {
		List<VehicleDTO> res = rest.getAll();
		Assert.assertEquals(4, res.size());
	}

	private VehicleDTO generateDto() {
		VehicleDTO dto = new VehicleDTO();
		dto.setPlate("AAAA");
		return dto;
	}
	@Test
	@Transactional
	public void testSave() {
		rest.save(generateDto());
		Assert.assertEquals("AAAA",rest.getByPlate("AAAA").getPlate());
	}

	@Test
	@Transactional
	public void testAddEntry() {
		EntryDTO entry =  new EntryDTO();
		entry.setId(6);
		entry.setDate("2018-07-28 10:10:00.000");
		entry.setInfo("Test");
		entry.setPlate("JYSH-22");
		rest.addEntry(entry);
		List<EntryDTO> entries = rest.getEntries("JYSH-22");
		Assert.assertEquals(1,entries.size());
		Assert.assertEquals("Test",entries.get(0).getInfo());
	}

	@Test
	@Transactional
	public void testDeleteEntry() {
		rest.deleteEntry(1);
		List<EntryDTO> entries = rest.getEntries("FYJA-44");
		EntryDTO entry =  new EntryDTO();
		entry.setId(1);
		Assert.assertTrue(!entries.contains(entry));
	}
 
	@Test
	public void testGetEntries() {
		List<EntryDTO> entries = rest.getEntries("FYJA-44");
		EntryDTO entry =  new EntryDTO();
		entry.setId(1);
		Assert.assertTrue(entries.contains(entry));
		entry.setId(2);
		Assert.assertTrue(entries.contains(entry));
		entry.setId(3);
		Assert.assertTrue(entries.contains(entry));
	}

}
