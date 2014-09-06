/**
 * Fecha de creación: 11/02/2011 23:26:18
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.rest.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;

/**
 * TODO [Descripcion de la clase]
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@Path("/xml/")
public class XMLResource {

	/**
	 * @param streamSource
	 * @return
	 */
	@Path("A")
	@POST
	public StreamSource get1(StreamSource streamSource) {
		return streamSource;
	}

	/**
	 * @param saxSource
	 * @return
	 */
	@Path("B")
	@POST
	public SAXSource get2(SAXSource saxSource) {
		return saxSource;
	}

	/**
	 * @param domSource
	 * @return
	 */
	@Path("C")
	@POST
	public DOMSource get3(DOMSource domSource) {
		return domSource;
	}

	/**
	 * @param document
	 * @return
	 */
	@Path("D")
	@POST
	public Document get4(Document document) {
		return document;
	}
}
