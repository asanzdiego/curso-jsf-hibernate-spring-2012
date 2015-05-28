package app.parejas.negocio;

public interface ServiceLocator {
	public final static String SERVICIO_PAREJAS="servicioParejas";
	public Object lookup(String nombre);
}
