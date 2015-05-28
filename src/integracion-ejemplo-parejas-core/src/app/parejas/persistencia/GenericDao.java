package app.parejas.persistencia;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T,K extends Serializable> {

	public void guardar(T p);

	public void borrar(T p);

	public T buscar(K n);

	public List<T> listar();

}