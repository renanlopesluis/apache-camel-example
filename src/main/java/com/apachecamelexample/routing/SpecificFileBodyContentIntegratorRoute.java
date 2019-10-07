package com.apachecamelexample.routing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.apachecamelexample.config.FileIntegratorProperties;

@Component
@Qualifier("specificFileBodyContentIntegrator")
public class SpecificFileBodyContentIntegratorRoute extends AbstractApacheCamelIntegratorRoute {

	@Override
	public void configure() throws Exception {
		moveASpecificFileByBodyContent();
	}

	private void moveASpecificFileByBodyContent() {
		from(super.FILE + FileIntegratorProperties.SOURCE + super.NOOP_CONFIG)
				.filter(body().startsWith(FileIntegratorProperties.FILTER))
				.to(super.FILE + FileIntegratorProperties.DESTINATION);
	}

}
