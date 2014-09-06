/**
 * Fecha de creaci�n: 11/02/2011 22:59:36
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es informaci�n pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.lab7;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Cliente Jersey empleado para invocar a un WS enviando una peticion POST:
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class JerseyEncuestaClientTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(JerseyEncuestaClientTestCase.class);

	private static String url = "http://localhost:8080/ejemplos-jersey-web/resources/guardaEncuesta";

	@Test
	public void invokeResource() {
		Form f = new Form();
		f.asMap().add("nombre", "jorge");
		Client c = ClientBuilder.newClient();
		WebTarget webT = c.target(url);
		logger.debug("Invocando al recurso {}", url);
		Invocation.Builder invocationBuilder = webT.request(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
				.accept(MediaType.TEXT_HTML_TYPE);
		 String respuesta = invocationBuilder.post(Entity.form(f),String.class);
		logger.debug("Respuesta del servicio: {}", respuesta);
	}
}
