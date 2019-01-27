package es.binarycode.gesclas;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.binarycode.gesclas.entity.Alumno;
import es.binarycode.gesclas.repository.AlumnoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AlumnoRepoTest {

	@Autowired
	AlumnoRepository alumnoDao;


	@Test
	public void getFind() {
		Assert.assertEquals("Antonio", alumnoDao.findById(1).get().getNombre());
	} 
	
	@Test
	public void addAlumno() {
		String nombreAlumnoTest = "Nombre alumno test 1";
		Alumno alumno = new Alumno();
		alumno.setNombre(nombreAlumnoTest);
		
		alumnoDao.save(alumno);	
		
		Assert.assertEquals(nombreAlumnoTest, 
				alumnoDao.findById(alumno.getIdAlumno()).get().getNombre());
	} 
	
	
}
