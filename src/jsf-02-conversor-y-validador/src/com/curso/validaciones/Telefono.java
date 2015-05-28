package com.curso.validaciones;

public class Telefono {

  private String prefijo;

  private String numero;

  public Telefono() {

  }

  public String getNumero() {

    return this.numero;
  }

  public void setNumero(final String numero) {

    this.numero = numero;
  }

  public String getPrefijo() {

    return this.prefijo;
  }

  public void setPrefijo(final String prefijo) {

    this.prefijo = prefijo;
  }

  @Override
  public String toString() {

    final StringBuffer elNumero = new StringBuffer();
    elNumero.append(this.prefijo);
    elNumero.append("-");
    elNumero.append(this.numero);
    return elNumero.toString();
  }
}
