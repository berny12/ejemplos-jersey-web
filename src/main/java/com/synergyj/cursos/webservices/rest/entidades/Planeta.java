/**
 * Fecha de creaci�n: 11/02/2011 23:48:12
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es informaci�n pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.rest.entidades;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase anotada con JAXB empleada para generar XML
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@XmlRootElement
public class Planeta {

	private String nombre;

	private int numeroPlaneta;

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre para inicializar el atributo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return numeroPlaneta
	 */
	public int getNumeroPlaneta() {
		return numeroPlaneta;
	}

	/**
	 * @param numeroPlaneta para inicializar el atributo numeroPlaneta
	 */
	public void setNumeroPlaneta(int numeroPlaneta) {
		this.numeroPlaneta = numeroPlaneta;
	}

	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", numeroPlaneta=" + numeroPlaneta
				+ "]";
	}
}
