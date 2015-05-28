package app.parejas.pruebas;


import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.parejas.modelo.Persona;
import app.parejas.negocio.ServicioParejas;
import app.parejas.persistencia.PersonaDao;

public class PruebasNegocio {
	private static ApplicationContext ctx;
	private static PersonaDao pDao;
	private ServicioParejas buscador;

	@BeforeClass
	public static void alPrincipio() throws Exception {
		ctx = new ClassPathXmlApplicationContext(
				new String[]{"**/persistencia.xml","**/negocio.xml"});
		pDao=(PersonaDao) ctx.getBean("personaDao");
		Persona persona1 = new Persona("felix",68,1.79f,Persona.HOMBRE,false);
		persona1.getAficiones().add("leer");
		persona1.getAficiones().add("montar en bici");
		Persona persona2 = new Persona("maria",28,1.75f,Persona.MUJER,true);
		persona2.getAficiones().add("bailar");
		persona2.getAficiones().add("cantar");
		persona2.getAficiones().add("pasear");
		List<Persona> personas=
			Arrays.asList(new Persona("mariano",78,1.75f,Persona.HOMBRE,true),
						  new Persona("andres",83,1.65f,Persona.HOMBRE,false),
						  new Persona("juan",72,1.85f,Persona.HOMBRE,true),
						  persona1,
						  persona2,
						  new Persona("lucia",98,1.57f,Persona.MUJER,false));
		
		for(Persona p:personas)
			pDao.guardar(p);
	}

	@AfterClass
	public static void alFinal() throws Exception {
		pDao=null;
		ctx=null;
	}

	@Before
	public void antes() throws Exception {
		buscador=(ServicioParejas) ctx.getBean("servicioParejas");
	}

	@After
	public void despues() throws Exception {
		buscador=null;
	}
	
	@Test(timeout=500)
	public void pruebasHombre(){
		Persona usuario2=new Persona("manolo",25,1.66F,Persona.HOMBRE,true);
		Persona ideal2=buscador.encontrarIdeal(usuario2);
		assertNotNull(ideal2);
		assertEquals("maria", ideal2.getNombre());
		List<Persona> afines2=buscador.encontrarAfines(usuario2);
		assertEquals(2, afines2.size());
		
		
	}
	@Test(timeout=500)
	public void pruebasMujer(){
		Persona usuario=new Persona("manoli",24,1.78F,Persona.MUJER,true);
		Persona ideal=buscador.encontrarIdeal(usuario);
		assertNull(ideal);
		List<Persona> afines=buscador.encontrarAfines(usuario);
		assertEquals(3, afines.size());
	}

}
