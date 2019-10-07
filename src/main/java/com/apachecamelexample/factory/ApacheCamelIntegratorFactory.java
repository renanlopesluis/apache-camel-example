package com.apachecamelexample.factory;

import com.apachecamelexample.enums.IntegratorTypeEnum;
import com.apachecamelexample.routing.AbstractApacheCamelIntegratorRoute;
import com.apachecamelexample.routing.AllFilesIntegratorRoute;
import com.apachecamelexample.routing.SpecificFileBodyContentIntegratorRoute;
import com.apachecamelexample.routing.SpecificFileIntegratorRoute;

public class ApacheCamelIntegratorFactory {
	
	public static AbstractApacheCamelIntegratorRoute instance(IntegratorTypeEnum integratorType) throws ClassNotFoundException {
		switch(integratorType) {
			case ALL_FILES_INTEGRATOR: return new AllFilesIntegratorRoute();
			case SPECIFIC_FILE_NAME_INTEGRATOR: return new SpecificFileIntegratorRoute();
			case SPECIFIC_FILE_BODY_INTEGRATOR: return new SpecificFileBodyContentIntegratorRoute();
			default: throw new ClassNotFoundException();
		}
	}

}
