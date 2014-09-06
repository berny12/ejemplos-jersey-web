/**
 * Fecha de creación: 11/02/2011 18:37:04
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.rest.resources;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.cursos.webservices.rest.entidades.Producto;
import com.synergyj.cursos.webservices.rest.entidades.Tarjeta;
import com.synergyj.cursos.webservices.rest.entidades.TipoPago;

/**
 * Resource que muestra la forma en la que se realiza la extraccion de parametros.
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
@Path("/ejemploParams")
public class EjemploParamsResource {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory.getLogger(EjemploParamsResource.class);

	/**
	 * @return
	 */
	@GET
	@Produces("text/html")
	public String obtenParametros(
			@DefaultValue("sin sucursal") @QueryParam("sucursal") String sucursal,
			@DefaultValue("true") @QueryParam("clientePreferente") boolean clientePreferente,
			@QueryParam("monto") Double monto, @QueryParam("tipoPago") TipoPago tipoPago,
			@QueryParam("tarjeta") Tarjeta datosTarjeta,
			@QueryParam("producto") List<Producto> productos) {

		StringBuffer sb;

		sb = new StringBuffer();
		sb.append("sucursal: ").append(sucursal).append("<br>clientePreferente: ")
				.append(clientePreferente).append("<br>monto: ").append(monto)
				.append("<br>tipoPago:").append(tipoPago).append("<br>tarjeta: ")
				.append(datosTarjeta).append("<br>productos: ").append(productos);

		logger.debug("parametros de la peticion {}", sb.toString());

		return sb.toString();

	}
}
