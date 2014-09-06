/**
 * Fecha de creación: 11/02/2011 20:40:21
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Esta clase muestra el uso de @FormParam
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@Path("/guardaEncuesta")
public class EncuestaResource {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(EncuestaResource.class);

	@POST
	/*
	 * para decir que si viene de una forma
	 */
	@Consumes("application/x-www-form-urlencoded")
	@Produces("text/html")
	/*
	 * se usar @FormParam para accesar los controles de la forma, el atributo para identificar es el name
	 */
	public String guardaEncuesta(@FormParam("nombre") String nombre,
			@FormParam("cursoPreferido") String cursoPreferido, @FormParam("edad") int edad) {

		logger.debug("Extrayendo los datos de la encueesta");
		return "nombre: " + nombre + "<br>" + "edad: " + edad + "<br>curso preferido: "
				+ cursoPreferido;

	}

}
