package com.autentia.pruebaTablas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase que representa un usuario
 * 
 * @author Bea
 */

public class Usuario implements Serializable {
	/** Login */
	private String login;

	/** Password */
	private String password;

	/** Nombre */
	private String nombre;

	/** Perfil */
	private Perfil perfil;

	/** Edad */
	private int edad;

	/** Fecha de nacimiento */
	private Date fechaNacimiento;

	/** Constructor */
	public Usuario(String login, String password, String nombre, Perfil perfil,
			int edad, Date fechaNacimiento) {
		this.login = login;
		this.password = password;
		this.nombre = nombre;
		this.perfil = perfil;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	/**
	 * Devuelve una lista "a pelo" de usuarios
	 */
	public static List getListaTemporal() {
		List lista = new ArrayList();
		int edad = 5;

		for (int i = 0; i < 50; i++) {
			Perfil unPerfil = null;
			if (i % 2 == 0)
				unPerfil = new Perfil(Perfil.ADMINISTRADOR);
			else
				unPerfil = new Perfil(Perfil.USUARIO_CONSULTAS);
			if (edad >= 70)
				edad -= i;
			else if (edad < 70)
				edad += i;
			Usuario usuario = new Usuario("unLogin_" + i, "unaPassword_" + i,
								"Un nombre completo_" + i, unPerfil, edad, 
								Utilidades.sumarDias(Utilidades.getTodayDateD(), (i + 1)));
			lista.add(usuario);
		}
		return lista;

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
