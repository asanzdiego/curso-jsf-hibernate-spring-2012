import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.faces.event.ValueChangeEvent;


public class GestionPersonas implements Serializable{
	private Persona pEdicion;
	private List<Persona> listado;
	
	//action method
	public String guardar(){
		listado.add(pEdicion);
		pEdicion=new Persona();
		return "listado";
	}
	
	//value change listener
	public void oyenteValor(ValueChangeEvent e){
		System.out.println(e.getComponent().getId()+":"+e.getOldValue()+"->"+e.getNewValue());
		
		//los flujos de salida del faces servlet
		FacesContext.getCurrentInstance().getResponseStream();
		FacesContext.getCurrentInstance().getResponseWriter();
		//terminamos el response actual
		//FacesContext.getCurrentInstance().responseComplete();
		//ponemos un mensaje
		FacesContext.getCurrentInstance()
			.addMessage("msg", new FacesMessage(
				FacesMessage.SEVERITY_INFO,"informacion!!","se ha tratado el evento"));
		//la vista actual
		FacesContext.getCurrentInstance().getViewRoot();
		//el idioma 
		System.out.println(
				FacesContext.getCurrentInstance().getViewRoot().getLocale());
		//buscar un componente y tocarlo
		HtmlInputText cajaNombre=(HtmlInputText) FacesContext.getCurrentInstance()
				.getViewRoot().findComponent("pantalla:nombre");
		cajaNombre.setDisabled(true);
		//accedemos a la configuracion de la aplicacion
		FacesContext.getCurrentInstance().getApplication();
		//nos salimos al contexto web
		FacesContext.getCurrentInstance().getExternalContext();
		
		// ir a phase 6
		FacesContext.getCurrentInstance().renderResponse();
		
		
		
	}
		
	public GestionPersonas() {
		//esto se podria inicializar asi
		//pEdicion=new Persona();
		//pero para ejemplo Dependency Injection lo hacemos en faces-config.xml
	}
	
	public Persona getPEdicion() {
		return pEdicion;
	}
	public void setPEdicion(Persona edicion) {
		pEdicion = edicion;
	}
	public List<Persona> getListado() {
		return listado;
	}
	public void setListado(List<Persona> listado) {
		this.listado = listado;
	}
	
	
}
