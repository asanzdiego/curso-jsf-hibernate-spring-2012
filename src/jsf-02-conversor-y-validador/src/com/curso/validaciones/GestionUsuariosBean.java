package com.curso.validaciones;

import java.util.Date;

public class GestionUsuariosBean {

  private String nombre;

  private int edad;

  private Date fechaNacimiento;

  private String nif;

  private long sueldo;

  private Telefono telefono;

  private String password;

  public GestionUsuariosBean() {

  }

  public String getPassword() {

    return this.password;
  }

  public void setPassword(final String password) {

    this.password = password;
  }

  public Telefono getTelefono() {

    return this.telefono;
  }

  public void setTelefono(final Telefono telefono) {

    this.telefono = telefono;
  }

  public int getEdad() {

    return this.edad;
  }

  public void setEdad(final int edad) {

    this.edad = edad;
  }

  public Date getFechaNacimiento() {

    return this.fechaNacimiento;
  }

  public void setFechaNacimiento(final Date fechaNacimiento) {

    this.fechaNacimiento = fechaNacimiento;
  }

  public String getNombre() {

    return this.nombre;
  }

  public void setNombre(final String nombre) {

    this.nombre = nombre;
  }

  public long getSueldo() {

    return this.sueldo;
  }

  public void setSueldo(final long sueldo) {

    this.sueldo = sueldo;
  }

  public String getNif() {

    return this.nif;
  }

  public void setNif(final String nif) {

    this.nif = nif;
  }
}
