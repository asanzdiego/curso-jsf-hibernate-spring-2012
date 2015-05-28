package app.parejas.presentacion.frontend;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import app.parejas.negocio.ServiceLocator;

public abstract class AbstractGestionBean {
	protected ServiceLocator serviceLocator; 
	
	public ServiceLocator getServiceLocator() {
		return serviceLocator;
	}

	public void setServiceLocator(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}

	public AbstractGestionBean() {
		super();
	}

	protected void mensaje(String id, String texto) {
		FacesContext.getCurrentInstance().addMessage(id,
				 new FacesMessage(texto));
	}

}