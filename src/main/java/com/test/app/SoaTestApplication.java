/**
 * https://blog.codecentric.de/en/2016/02/spring-boot-apache-cxf/
 */

package com.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The CXFServlet will process all SOAP requests that reach our URI 
 * /soap-api/* and the cxf-SpringBus gets the CXF framework up and 
 * running, with all needed CXF modules – see CXF´s architecture.
 * http://cxf.apache.org/docs/cxf-architecture.html
 * 
 * @author amar
 *
 */
@SpringBootApplication
@ComponentScan("com.test.service")
public class SoaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoaTestApplication.class, args);
	}

	
}
