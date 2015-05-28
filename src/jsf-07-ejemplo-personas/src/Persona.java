

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Persona implements Serializable{
	private String nombre;
	private int edad;
	private float altura;
	private Date fecha;



	public Persona(String nombre, int edad, float altura, Date fecha) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.fecha = fecha;
	}

	public Persona() {}
	
	public Persona(String nombre, int edad, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}


	
}
