package app.parejas.negocio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import app.parejas.persistencia.PersonaDao;

public abstract class AbstractServicioPersonaDao {
	//ojo con esto que queda mejor con static
	protected final Log log=LogFactory.getLog(getClass());

	protected PersonaDao pDao;

	public AbstractServicioPersonaDao() {
		super();
	}

	public PersonaDao getPDao() {
		return pDao;
	}

	public void setPDao(PersonaDao dao) {
		pDao = dao;
	}

}