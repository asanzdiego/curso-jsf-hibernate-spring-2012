package com.curso.validaciones;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.apache.commons.lang.StringUtils;

public class TelefonoConverter implements Converter {

  /**
   * Devuelve la representacion Telefono de JAVA a partir del valor de un
   * componente JSF
   */
  public Object getAsObject(final FacesContext context,
      final UIComponent component, final String value)
      throws ConverterException {

    Telefono telefono = null;
    if (!StringUtils.isEmpty(value)) {
      telefono = new Telefono();

      final String[] valores = StringUtils.split(value, "-");
      if (valores.length != 2) {
        throw new ConverterException(
            new FacesMessage(
                "El numero de telefono debe tener el siguiente formato:"
                    + " 'pp-nnn nn nn', donde pp es el prefijo y nnn nn nn es el numero"));
      }
      if (valores[0].length() != 2) {
        throw new ConverterException(new FacesMessage(
            "El prefijo del numero de telefono debe tener de tipo NN"));
      }

      final String elNumero = StringUtils.remove(valores[1], ' ');
      if (elNumero.length() != 7) {
        throw new ConverterException(new FacesMessage(
            "El numero de telefono debe ser de tipo NNN NN NN"));
      }

      telefono.setPrefijo(valores[0]);
      telefono.setNumero(valores[1]);
    }
    return telefono;
  }

  /**
   * Devuelve la representacion cadena de un telefono
   */
  public String getAsString(final FacesContext context,
      final UIComponent component, final Object value)
      throws ConverterException {

    return value == null ? null : value.toString();
  }
}
