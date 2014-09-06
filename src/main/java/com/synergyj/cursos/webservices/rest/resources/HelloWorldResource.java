/**
 * Fecha de creación: 10/02/2011 12:13:47
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ejemplo WS tipo REST
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@Path("/helloWorld")
public class HelloWorldResource {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldResource.class);

	/**
	 * Metodo que obtiene una cadena de texto como resultado de una peticion GET
	 * @return
	 */
	@GET
	@Produces(value = "text/plain")
	public String getSaludo() {
		logger.debug("invocando recurso WEB formato texto.");
		return "Hola Mundo";

	}
}
