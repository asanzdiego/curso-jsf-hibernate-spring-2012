package com.autentia.pruebaTablas;

/**
 * Clase que ordena tablas de datos
 * 
 * @author AUTENTIA
 * 
 */

public abstract class ListaOrdenada {
	/** Nombre de la columna por la que se desea ordenar el listado */
	private String columna;

	/** Indicador de si la ordanación va a ser ascendente o descendente */
	private boolean ascendente;

	/** Constructor */
	public ListaOrdenada(String defColumna) {
		columna = defColumna;
		ascendente = esOrdenacionAscendente(defColumna);
	}

	/**
	 * Ordena la lista
	 */
	protected abstract void sort(String columna, boolean ascendente);

	/**
	 * Devuelve true si la ordenación por defecto de la columna es ascendente
	 */
	protected abstract boolean esOrdenacionAscendente(String columnaAOrdenar);

	/**
	 * Método al que invoca el control de JSF cuando el usuario selecciona
	 * ordenar la lista
	 */
	public void sort(String columnaAOrdenadar) {
		System.out.println("------------------------"+columnaAOrdenadar);
		if (columnaAOrdenadar == null) {
			throw new IllegalArgumentException("No se puede ordenar una columna null");
		}

		if (columna.equals(columnaAOrdenadar)) {
			// La columna actual es igual a la columna a ordena=>Hay que ordenar
			// en sentido contrario
			ascendente = !ascendente;
		} else {
			// Ordena en el sentido por defecto
			columna = columnaAOrdenadar;
			ascendente = esOrdenacionAscendente(columna);
		}
		sort(columna, ascendente);
	}

	public boolean isAscendente() {
		return ascendente;
	}

	public void setAscendente(boolean ascendente) {
		this.ascendente = ascendente;
	}

	public String getSort() {
		return columna;
	}

	public void setSort(String columna) {
		this.columna = columna;
	}

}
