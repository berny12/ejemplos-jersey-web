/**
 * Fecha de creación: 11/02/2011 15:00:22
 *
 * Copyright (c) 2011 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.cursos.webservices.rest.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * Clase que registra los recursos a exponer de forma programatica.
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class JerseyApplication extends Application {

	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
		s.add(HelloWorldResource.class);
		return s;
	}

}
