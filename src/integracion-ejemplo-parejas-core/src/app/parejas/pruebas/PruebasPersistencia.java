package app.parejas.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.parejas.modelo.Persona;
import app.parejas.persistencia.PersonaDao;

public class PruebasPersistencia {

	private ApplicationContext ctx;
	private PersonaDao pDao;

	@Before
	public void prepara() throws Exception {
		ctx = new ClassPathXmlApplicationContext("**/persistencia.xml");
		pDao=(PersonaDao) ctx.getBean("personaDao");
	}

	@After
	public void limpia() throws Exception {
		pDao=null;
		ctx=null;
	}

	@Test
	public void pruebas() {
		List<Persona> personas=
			Arrays.asList(new Persona("mariano",78,1.75f,Persona.HOMBRE,true),
						  new Persona("andres",83,1.65f,Persona.HOMBRE,false),
						  new Persona("juan",72,1.85f,Persona.HOMBRE,true),
						  new Persona("felix",68,1.79f,Persona.HOMBRE,false),
						  new Persona("maria",28,1.75f,Persona.MUJER,true),
						  new Persona("lucia",98,1.55f,Persona.MUJER,false));
		
		for(Persona p:personas)
			pDao.guardar(p);
		
		//Assert.assertEquals(6, pDao.listar().size());
		assertEquals(6, pDao.listar().size());
		assertEquals(4, pDao.listarHombres().size());
		assertEquals(2, pDao.listarMujeres().size());
		
		assertNotNull(pDao.buscar("maria"));
		
		assertNull(pDao.buscar("felisa"));
		
		pDao.borrar(pDao.buscar("maria"));
		assertNull(pDao.buscar("maria"));
		
		assertEquals(5, pDao.listar().size());
		assertEquals(4, pDao.listarHombres().size());
		assertEquals(1, pDao.listarMujeres().size());
		
	}

}
