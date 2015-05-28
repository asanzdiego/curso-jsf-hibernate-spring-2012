package app.parejas.negocio;

import javax.faces.context.FacesContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

public class ServiceLocatorJSFImpl implements ServiceLocator {

	public Object lookup(String nombre) {
		WebApplicationContext ctx =	FacesContextUtils.getRequiredWebApplicationContext(
				FacesContext.getCurrentInstance());
		return ctx.getBean(nombre);
	}

}
