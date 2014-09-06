/**
 * Fecha de creación: 10/02/2011 17:21:45
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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Este recurso ejemplifica el uso de URI templates en conjunto con @Path
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@Path("/users/{username : [a-zA-Z][a-zA-Z_0-9]*}")
public class UsersResource {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(UsersResource.class);

	@GET
	@Produces("text/html")
	public String showUserName(@PathParam("username") String usuario) {

		logger.debug(" Invocando RestWS, Hola {}", usuario);
		return "<html><body>Hola usuario <b>" + usuario + "</b></body></html>";
	}
}
