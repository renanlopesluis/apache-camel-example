package com.apachecamelexample.routing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.apachecamelexample.config.FileIntegratorProperties;
import com.apachecamelexample.processor.AllFilesProcessor;

@Component
@Qualifier("allFilesIntegrator")
public class AllFilesIntegratorRoute extends AbstractApacheCamelIntegratorRoute {

	@Override
	public void configure() throws Exception {
		moveAllFiles();
	}

	private void moveAllFiles() {
		from(super.FILE + FileIntegratorProperties.SOURCE +"/allFiles"+ super.NOOP_CONFIG)
			.process(new AllFilesProcessor())
			.to(super.FILE + FileIntegratorProperties.DESTINATION);
	}

}
