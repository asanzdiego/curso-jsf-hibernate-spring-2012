package app.parejas.negocio;

import java.util.ArrayList;
import java.util.List;

import app.parejas.modelo.Persona;
import app.parejas.negocio.logica.Reglas;

public class ServicioParejasPersonaDaoImpl 
	extends AbstractServicioPersonaDao implements ServicioParejas {
	
	private Reglas reglas;
	
	public List<Persona> encontrarAfines(Persona usuario) {
		log.info("buscando afines para "+usuario);
		List<Persona> afines=new ArrayList<Persona>();
		List<Persona> universo;
		if(usuario.getSexo()==Persona.MUJER)
			universo=pDao.listarHombres();
		else
			universo=pDao.listarMujeres();
		
		for(Persona p:universo)
			if(reglas.esAfin(usuario,p))
				afines.add(p);
		
		log.info("encontrado "+afines.size()+" afines para "+usuario);
		return afines;
	}

	public Persona encontrarIdeal(Persona usuario) {
		log.info("buscando ideal para "+usuario);
		Persona ideal=null;
		List<Persona> universo;
		if(usuario.getSexo()==Persona.MUJER)
			universo=pDao.listarHombres();
		else
			universo=pDao.listarMujeres();
		
		for(Persona p:universo)
			if(reglas.esIdeal(usuario,p)){
				ideal=p;
				break;
			}
		if(ideal!=null)
			log.info("encontrado ideal para "+usuario);
		else
			log.info("NO encontrado ideal para "+usuario);
		return ideal;
	}

	public Reglas getReglas() {
		return reglas;
	}

	public void setReglas(Reglas reglas) {
		this.reglas = reglas;
	}

}
