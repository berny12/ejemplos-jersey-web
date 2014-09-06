/**
 * Fecha de creación: 10/02/2011 22:32:06
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
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Recurso que muestra el envio de contenido de diferente mime types
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
/*
 * para agregar otro mensaje
 */
//@Path("/clientMimeType/{mensaje}")
@Path("/clientMimeType/{mensaje}/{otromensaje}")
public class MimeTypesClientResource {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(MimeTypesClientResource.class);

	@Consumes("text/html")
	@GET
	public String procesaInfo(@PathParam("mensaje") String mensaje,
			@PathParam("otromensaje") String otromensaje) {
		logger.debug("Mensaje recibido {}", mensaje);
		logger.debug("otroMensaje recibido {}", otromensaje);
		return "OK, info "+mensaje+" procesada";
	}
}
