package app.parejas.negocio.logica;

import app.parejas.modelo.Persona;

public interface Reglas {

	public boolean esAfin(Persona u, Persona p);

	public boolean esIdeal(Persona u, Persona p);

}