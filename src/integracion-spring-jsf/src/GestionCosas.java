import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.jsf.FacesContextUtils;


public class GestionCosas {
	private Cosa c;
	
	public GestionCosas() {
//		WebApplicationContext ctx = WebApplicationContextUtils
//			.getRequiredWebApplicationContext((ServletContext)
//				FacesContext.getCurrentInstance()
//				.getExternalContext().getContext());
		WebApplicationContext ctx =	FacesContextUtils.getRequiredWebApplicationContext(
					FacesContext.getCurrentInstance());
		c=(Cosa) ctx.getBean("miCosa");
	}

	public Cosa getC() {
		return c;
	}

	public void setC(Cosa c) {
		this.c = c;
	}
	
	
}
