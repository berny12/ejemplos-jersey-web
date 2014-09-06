/**
 * Fecha de creaci�n: 11/02/2011 22:59:36
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es informaci�n pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.lab8;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Cliente Jersey empleado para invocar a un WS enviando una peticion POST:
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class JerseyXmlClientTestCase {
	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(JerseyXmlClientTestCase.class);

	private static String url = "http://localhost:8080/ejemplos-jersey-web/resources/xml";

	@Test
	public void invokeResource() {
		Client c;
		WebTarget webT;
		WebTarget webTLetra;
		String respuesta;
		String[] array = new String[] { "A", "B", "C", "D" };
		for (String suffix : array) {
			c = ClientBuilder.newClient();
			webT = c.target(url);
			webTLetra = webT.path(suffix);
			logger.debug("Invocando al recurso {}", webTLetra.getUri().getPath());
			Invocation.Builder invocationBuilder = webTLetra.request(MediaType.APPLICATION_FORM_URLENCODED_TYPE).accept(MediaType.TEXT_HTML_TYPE);
			respuesta = invocationBuilder.post(Entity.xml("<test>hola</test>"),String.class);
			logger.debug("Respuesta del servicio: {}", respuesta);
		}
	}
}
