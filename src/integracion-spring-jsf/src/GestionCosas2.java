import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.jsf.FacesContextUtils;


public class GestionCosas2 {
	private Cosa c;
	
	public GestionCosas2() {

	}

	public Cosa getC() {
		return c;
	}

	public void setC(Cosa c) {
		this.c = c;
	}
	
	
}
