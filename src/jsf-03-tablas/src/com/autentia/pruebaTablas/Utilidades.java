package com.autentia.pruebaTablas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Clase de utilidades
 * 
 * @author AUTENTIA
 */
public class Utilidades {

	/** Suma los días pasados como parámetro a la fecha pasada como parámetro */
	public static Date sumarDias(Date fecha, int dias) {
		// Recupero un calendar
		Calendar _calendar = dateToCalendar(fecha);

		// Realizo la operación de añadido
		_calendar.add(Calendar.DAY_OF_YEAR, dias);

		// Devuelvo la fecha
		return (_calendar.getTime());
	}

	/**
	 * Método que retorna una clase Calendar a partir de una clase Date.
	 */
	public static Calendar dateToCalendar(Date _date) {
		// Recupero un GregorianCalendar
		GregorianCalendar _gregorianCalendar = new GregorianCalendar();
		_gregorianCalendar.setTime(_date);
		// Devuelvo el Calendar
		return ((Calendar) _gregorianCalendar);
	}

	/**
	 * Devuelve la fecha actual
	 */
	public static Date getTodayDateD() {
		GregorianCalendar f1 = new GregorianCalendar();
		return new GregorianCalendar(f1.get(GregorianCalendar.YEAR), f1
				.get(GregorianCalendar.MONTH), f1
				.get(GregorianCalendar.DAY_OF_MONTH), 0, 0).getTime();
	}

	/**
	 * Da formato a una fecha
	 */
	public static String formatDate(Date d, String formato) {
		if (d == null)
			return "";
		else {
			SimpleDateFormat formatoTmp = new SimpleDateFormat(formato);
			return formatoTmp.format(d);
		}
	}
}
