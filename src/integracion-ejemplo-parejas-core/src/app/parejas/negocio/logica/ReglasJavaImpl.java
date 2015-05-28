package app.parejas.negocio.logica;

import app.parejas.modelo.Persona;

public class ReglasJavaImpl implements Reglas {

	public boolean esAfin(Persona u, Persona p) {
		return Math.abs(u.getEdad()-p.getEdad())<=10
			|| Math.abs(u.getAltura()-p.getAltura())<=.10f;
	}
	
	public boolean esIdeal(Persona u, Persona p) {
		return Math.abs(u.getEdad()-p.getEdad())<=10
			&& Math.abs(u.getAltura()-p.getAltura())<=.10f;
	}

}
