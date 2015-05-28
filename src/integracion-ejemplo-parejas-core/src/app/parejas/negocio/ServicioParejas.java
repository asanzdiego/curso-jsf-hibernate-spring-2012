package app.parejas.negocio;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import app.parejas.modelo.Persona;

//esta anotacion se metio cuando hicimos la aplicacion web transaccional
@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
public interface ServicioParejas {
	
	Persona encontrarIdeal(Persona usuario);

	List<Persona> encontrarAfines(Persona usuario);

}
