package com.autentia.pruebaTablas;

import java.io.Serializable;

/**
 * Clase que representa el rol de un usuario
 * 
 * @author AUTENTIA
 */

public class Perfil implements Serializable {
	/** Perfiles predefinidos */
	public static final int ADMINISTRADOR = 1;

	public static final int USUARIO_CONSULTAS = 2;

	/** Código del perfil */
	private int codigo = 0;

	/** Descripción del perfil */
	private String descripcion;

	/** Constructor */
	public Perfil(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		if (codigo == Perfil.ADMINISTRADOR)
			descripcion = "Administrador";
		else if (codigo == Perfil.USUARIO_CONSULTAS)
			descripcion = "Usuario de consultas";
		else
			descripcion = "Perfil desconocido";
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
