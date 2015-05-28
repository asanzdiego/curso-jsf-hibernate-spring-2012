package com.tutoriales.ajax4jsf.bean; 
import java.util.ArrayList; 
import java.util.List; 

import javax.faces.component.html.HtmlSelectManyListbox;
import javax.faces.model.SelectItem; 


public class HomeBean { 

	private String name; 
	private String lastName; 
	private List<SelectItem> hobbiesItems = new ArrayList<SelectItem>(); 
	private List<HtmlSelectManyListbox> hobbies = new ArrayList<HtmlSelectManyListbox>(); 
	
	public HomeBean() { 
		hobbiesItems.add(new SelectItem("Cine")); 
		hobbiesItems.add(new SelectItem("Teatro")); 
		hobbiesItems.add(new SelectItem("Televisión")); 
		hobbiesItems.add(new SelectItem("Lectura")); 
		hobbiesItems.add(new SelectItem("Deporte")); 
		hobbiesItems.add(new SelectItem("Fotografía")); 
		hobbiesItems.add(new SelectItem("Viajes")); 
	} 

	public List<SelectItem> getHobbiesItems() { 
		return hobbiesItems; 
	} 

	public void setHobbiesItems(List<SelectItem> hobbiesItems) { 
		this.hobbiesItems = hobbiesItems; 
	} 

	public String getLastName() { 
		return lastName; 
	} 
	
	public void setLastName(String lastName) { 
		this.lastName = lastName.toUpperCase(); 
	} 
	
	public String getName() { 
		return name; 
	} 
	
	public void setName(String name) { 
		this.name = name.toUpperCase(); 
	} 
	
	public List<HtmlSelectManyListbox> getHobbies() { 
		return hobbies; 
	} 
	
	public void setHobbies(List<HtmlSelectManyListbox> hobbies) { 
		this.hobbies = hobbies; 
	} 
	
	public String enviar(){
		System.out.println("fin---->"+name+","+lastName);
		return "ok";
	}
	
}