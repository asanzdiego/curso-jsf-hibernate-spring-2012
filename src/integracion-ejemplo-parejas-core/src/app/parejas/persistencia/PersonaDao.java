package app.parejas.persistencia;

import java.util.List;

import app.parejas.modelo.Persona;



public interface PersonaDao extends GenericDao<Persona,String> {
	public List<Persona> listarHombres();
	public List<Persona> listarMujeres();
}
