
package com.chinatelecom.operations.aqmhserivce;

import java.io.IOException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinatelecom.udp.core.server.ServerRuntime;

public class Server {
    
	private final static Logger logger=LogManager.getLogger(Server.class);
	
	public static void main(String args[]) throws IOException {		
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		try{
			URL url = Server.class.getResource("Server.class");
			ServerRuntime runtime=new ServerRuntime(context, 8968, "/aqmh",true,url.getProtocol().equals("file"));
//			String resourcePath;
//			if(url.getProtocol().equals("file")) {
//				resourcePath=TextHelper.getLeftPart(url.getPath().substring(1),"MetricsService",true) + "/MetricsService/src/main/webapp";
//				runtime.addResource(resourcePath, "/");
//			}
//			else {
//				resourcePath =TextHelper.getRightPart(TextHelper.getLeftPart(url.getFile(),"!",true),":",false);
//				runtime.addResource(resourcePath, "/html");
//			}
//			logger.info("loaded from " + resourcePath);
			
			runtime.startAndWait();
		}
		catch(Exception e) {
			logger.error(e.getMessage(),e);
		}
		
	}

	
}