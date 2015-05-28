package com.autentia.pruebaTablas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Bean encargado de generar listados de usuarios
 * @author AUTENTIA
 */

public class ListaUsuariosBean
{
	private List listaUsuarios;
	private String col;
	private boolean ascendente;
  
    /** Nombres de los campos susceptibles de ser ordenados */
    public static String NOMBRE_LOGIN="login";
    public static String NOMBRE_NOMBRE="nombre";
    public static String NOMBRE_PERFIL="perfil";
    public static String NOMBRE_EDAD="edad";
    public static String NOMBRE_FECHA="fecha";

   
    /** Constructor */
    public ListaUsuariosBean(){
       // El campo por el que debe ordenarse la tabla por defecto será el login
      col=NOMBRE_LOGIN;
      ascendente=true;
       // if(listaUsuarios.size()==0)
       if(listaUsuarios==null)
                   listaUsuarios = Usuario.getListaTemporal();
    }

    /** Devuelve una lista de usuarios (objetos Usuario) */
    public List getListaUsuarios(){
       sort(col, isAscendente());
        return listaUsuarios; 
     }
    
    /**
     * Devuelve true porque por defecto el sentido de la ordenación será ascendente
     */
    protected boolean esOrdenacionAscendente(String columnaOrdenar){
         return true;
    }

    /**
     * Ordena una lista de usuarios por un determinado campo según un determinado
     * orden
     */
    protected void sort(final String columna, final boolean ascendente){
    	System.out.println("---------->"+columna);
     Comparator comparator = new Comparator(){
		    public int compare(Object o1, Object o2)
		    {
		        Usuario u1 = (Usuario)o1;
		        Usuario u2 = (Usuario)o2;
		
		       if (columna == null)
		            return 0;
		        if (columna.equals(ListaUsuariosBean.NOMBRE_LOGIN))
		            return ascendente ? u1.getLogin().compareTo(u2.getLogin()) :
		                                u2.getLogin().compareTo(u1.getLogin());
		        else if (columna.equals(ListaUsuariosBean.NOMBRE_NOMBRE))
		            return ascendente ? u1.getNombre().compareTo(u2.getNombre()) :
		                                u2.getNombre().compareTo(u1.getNombre());
		        else if (columna.equals(ListaUsuariosBean.NOMBRE_PERFIL))
		            return ascendente ? u1.getPerfil().getDescripcion().compareTo(u2.getPerfil().getDescripcion()) :
		                                u2.getPerfil().getDescripcion().compareTo(u1.getPerfil().getDescripcion()); 
		        else if (columna.equals(ListaUsuariosBean.NOMBRE_EDAD))
		            return ascendente ? u1.getEdad()-u2.getEdad() :
		                                u2.getEdad()-u1.getEdad();
		        else if (columna.equals(ListaUsuariosBean.NOMBRE_FECHA))
		                return ascendente ? u1.getFechaNacimiento().compareTo(u2.getFechaNacimiento()) :
		                                    u2.getFechaNacimiento().compareTo(u1.getFechaNacimiento());
		        else return 0;
		    }
		};
		Collections.sort(listaUsuarios,comparator);
    }
	public String getSort() {
		return col;
	}
	public boolean isAscendente() {
		return ascendente;
	}
	public void setSort(String columna) {
		this.col = columna;
	}
	
	public void setAscendente(boolean ascendente) {
		this.ascendente = ascendente;
	}
}
