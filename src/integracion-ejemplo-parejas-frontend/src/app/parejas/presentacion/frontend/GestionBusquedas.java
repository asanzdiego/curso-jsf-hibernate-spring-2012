package app.parejas.presentacion.frontend;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;


import app.parejas.modelo.Persona;
import app.parejas.negocio.ServiceLocator;
import app.parejas.negocio.ServicioParejas;

public class GestionBusquedas extends AbstractGestionBean implements Serializable{

	private Persona usuario;
	private Persona ideal;
	private List<Persona> afines;
	private ServicioParejas buscador;
	
	public GestionBusquedas() {
		super();
		usuario=new Persona();
		
	}
	
	@PostConstruct
	public void trasCrearyConfigurar(){
		//buscador=(ServicioParejas) serviceLocator.lookup("servicioParejas");
		buscador=(ServicioParejas) 
			serviceLocator.lookup(ServiceLocator.SERVICIO_PAREJAS);
	}
	
	//action method
	public Object buscar(){
		 ideal = buscador.encontrarIdeal(usuario);
		 if(ideal!=null){
			 mensaje("msg","enhorabuena!!!");
			 return Vistas.encontrado;
		 }else{
			 mensaje("msg","lastima!!!");
			 afines=buscador.encontrarAfines(usuario);
			 return Vistas.no_encontrado;
		 }
	}

	public Persona getUsuario() {
		return usuario;
	}

	public void setUsuario(Persona usuario) {
		this.usuario = usuario;
	}

	public Persona getIdeal() {
		return ideal;
	}

	public void setIdeal(Persona ideal) {
		this.ideal = ideal;
	}

	public List<Persona> getAfines() {
		return afines;
	}

	public void setAfines(List<Persona> afines) {
		this.afines = afines;
	}

	public ServicioParejas getBuscador() {
		return buscador;
	}

	public void setBuscador(ServicioParejas buscador) {
		this.buscador = buscador;
	}
	
	
	
}
