package com.apachecamelexample.routing;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractApacheCamelIntegratorRoute extends RouteBuilder{
	
	protected final String NOOP_CONFIG = "?noop=true";
	protected final String FILE = "file:";
	protected final String FILENAME_CONFIG = "?fileName=";

		
}
