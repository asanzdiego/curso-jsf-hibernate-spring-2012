package com.tutoriales.ajax4jsf.bean;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;


public class OyenteFases implements PhaseListener {

	public void afterPhase(PhaseEvent pe) {
		if(pe.getPhaseId()==PhaseId.RENDER_RESPONSE)
			System.out.println("-------------------->peticion servida!!");
		System.out.println("despues de "+pe.getPhaseId().toString());

	}

	public void beforePhase(PhaseEvent pe) {
		if(pe.getPhaseId()==PhaseId.RESTORE_VIEW)
			System.out.println("-------------------->peticion recibida!!");
		System.out.println("antes de "+pe.getPhaseId().toString());
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
