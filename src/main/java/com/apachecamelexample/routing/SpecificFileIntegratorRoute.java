package com.apachecamelexample.routing;

import org.apache.camel.Exchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.apachecamelexample.config.FileIntegratorProperties;

@Component
@Qualifier("specificFileIntegrator")
public class SpecificFileIntegratorRoute extends AbstractApacheCamelIntegratorRoute {

	private final String SEARCH = "Specific";
	
	@Override
	public void configure() throws Exception {
		moveASpecificFileByName();
	}

	private void moveASpecificFileByName() {
		from(super.FILE + FileIntegratorProperties.SOURCE +"/specificFiles"+ super.NOOP_CONFIG)
				.filter(header(Exchange.FILE_NAME).startsWith(FileIntegratorProperties.FILTER+SEARCH))
				.to(super.FILE + FileIntegratorProperties.DESTINATION);
	}

}
