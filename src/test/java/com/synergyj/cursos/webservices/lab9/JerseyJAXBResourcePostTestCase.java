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
import javax.ws.rs.client.Entity;
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
public class JerseyJAXBResourcePostTestCase {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(JerseyJAXBResourcePostTestCase.class);

	private static final String url = "http://localhost:8080/ejemplos-jersey-web/resources";

	@Test
	public void muestraDatosPlaneta() {
		Client c;
		WebTarget webT;
		Planeta planeta;
		logger.debug("Enviando un objeto Planeta al server");
		c = ClientBuilder.newClient();
		webT = c.target(url);
		planeta = new Planeta();
		planeta.setNombre("Marte");
		planeta.setNumeroPlaneta(4);
		logger.debug("Invocando recurso");
		webT.path("planetas").request().accept(MediaType.APPLICATION_XML_TYPE).post(Entity.xml(planeta) );

	}
}
