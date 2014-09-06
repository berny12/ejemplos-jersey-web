/**
 * Fecha de creación: 11/02/2011 23:49:39
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.rest.entidades.Planeta;

/**
 * TODO [Descripcion de la clase]
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@Path("/planetas")
public class JAXBResource {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(JAXBResource.class);

	/**
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Planeta getDatosPlaneta() {
		Planeta planeta;
		planeta = new Planeta();
		planeta.setNombre("tierra");
		planeta.setNumeroPlaneta(3);

		logger.debug("Enviando XML con los datos del planeta.");
		return planeta;
	}

	/**
	 * @param p
	 */
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void creaPlaneta(Planeta p) {

		logger.debug("datos del planeta recibido: {}", p);
	}

}
