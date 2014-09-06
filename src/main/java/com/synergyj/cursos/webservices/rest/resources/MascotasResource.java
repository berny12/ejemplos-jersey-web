/**
 * Fecha de creaci�n: 11/02/2011 21:21:29
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es informaci�n pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.rest.resources;

import java.io.File;

import javax.activation.MimetypesFileTypeMap;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Esta clase muestra la forma de representar recursos en forma de Imagen, a partir de un
 * archivo {@link File}
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@Path("/muestraImagen")
public class MascotasResource {

	private static final String IMG_DIR = "imagenes/";

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(MascotasResource.class);

	/**
	 * @param mascota
	 * @return
	 */
	@POST
	@Produces("image/*")
	public Response muestraImagen(@FormParam("mascota") String mascota) {
		File file;
		String mimeType;
		logger.debug("Obteniendo imagen {}", mascota);
		file = new File(IMG_DIR, mascota);
		if (!file.exists()) {
			logger.error("La imagen no existe");
			throw new WebApplicationException(500);
		}
		// obtiene el Mime type correspondiente al archivo representado por la variable
		// file.
		mimeType = new MimetypesFileTypeMap().getContentType(file);
		logger.debug("MimeType {}", mimeType);
		return Response.ok(file, mimeType).build();
	}
}
