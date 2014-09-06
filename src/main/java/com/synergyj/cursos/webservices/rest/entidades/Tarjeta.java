/**
 * Fecha de creación: 11/02/2011 18:55:27
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.rest.entidades;

/**
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class Tarjeta {

	private String numeroTarjeta;

	private String fechaExpiracion;

	public Tarjeta(String numeroTarjeta) {

		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return numeroTarjeta
	 */
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta para inicializar el atributo numeroTarjeta
	 */
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return fechaExpiracion
	 */
	public String getFechaExpiracion() {
		return fechaExpiracion;
	}

	/**
	 * @param fechaExpiracion para inicializar el atributo fechaExpiracion
	 */
	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return numeroTarjeta;
	}

}
