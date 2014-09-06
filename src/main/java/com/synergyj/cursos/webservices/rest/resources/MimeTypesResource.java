/**
 * Fecha de creación: 10/02/2011 21:58:53
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

/**
 * Recurso que muestra la estrategia para generar varios tipos de representación.
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@Path("/mimeTypes")
@Produces("text/plain")
public class MimeTypesResource {

	/**
	 * @return
	 */
	@GET
	public String getMensajeAsTexto() {

		return "Mostrando mensaje en modo text/plain";
	}

	/**
	 * @return
	 */
	@GET
	@Produces({ "application/xml", "application/json" })
	public String getMensajeAsHtmlJson() {

		return "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>"
				+ "<mensaje>Mostrando mensaje en modo</mensaje>";
	}
}
