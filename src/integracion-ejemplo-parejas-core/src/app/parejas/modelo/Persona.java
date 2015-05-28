package app.parejas.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Persona extends AbstractBaseBean implements Serializable {

	private static final long serialVersionUID = -5447377443624572605L;
	public static final char HOMBRE = 'h';
	public static final char MUJER = 'm';
	private String nombre;
	private Integer edad;
	private Float altura;
	private Character sexo;
	private Boolean soltero;
	private Set<String> aficiones=new HashSet<String>();
	
	public Persona() {}
	
	

	public Persona(String nombre, Integer edad, Float altura, Character sexo,
			Boolean soltero) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.sexo = sexo;
		this.soltero = soltero;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Boolean getSoltero() {
		return soltero;
	}

	public void setSoltero(Boolean soltero) {
		this.soltero = soltero;
	}



	public Set<String> getAficiones() {
		return aficiones;
	}



	public void setAficiones(Set<String> aficiones) {
		this.aficiones = aficiones;
	}

	
}
