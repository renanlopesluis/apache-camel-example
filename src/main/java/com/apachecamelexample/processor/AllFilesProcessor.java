package com.apachecamelexample.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.apachecamelexample.config.FileIntegratorProperties;

public class AllFilesProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		String fileName = exchange.getIn().getHeader(Exchange.FILE_NAME, String.class);
		if(fileName.equals(FileIntegratorProperties.FILTER)) {
			fileName = "new"+fileName;
		}
		exchange.getIn().setHeader(Exchange.FILE_NAME, fileName);
	}

}
