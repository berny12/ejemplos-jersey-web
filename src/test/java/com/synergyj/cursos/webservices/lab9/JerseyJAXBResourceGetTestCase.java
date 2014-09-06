/**
 * Fecha de creaci�n: 11/02/2011 23:55:37
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es informaci�n pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.lab9;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.rest.entidades.Planeta;

/**
 * @author Jorge Rodr�guez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class JerseyJAXBResourceGetTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(JerseyJAXBResourceGetTestCase.class);

	private static final String url = "http://localhost:8080/ejemplos-jersey-web/resources";

	@Test
	public void muestraDatosPlaneta() {
		Client c;
		WebTarget webT;
		Planeta planeta;
		logger.debug("Mostrando los dartos de un planeta");
		c = ClientBuilder.newClient();
		webT = c.target(url);
		planeta = webT.path("planetas").request().accept(MediaType.APPLICATION_XML_TYPE).get(Planeta.class);
		logger.debug("Planeta  obtenido: {}", planeta);
	}
}
