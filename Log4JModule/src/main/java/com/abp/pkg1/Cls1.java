package com.abp.pkg1;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Cls1 {
	
	public static final Logger log = Logger.getLogger(Cls1.class);
	
	public static void main(String[] args) throws InterruptedException {
				
		
		/*log.trace("Sample trace message");
		log.debug("Sample debug message");
		log.info("Sample info message");
		log.warn("Sample warn message");
		log.error("Sample error message");
		log.fatal("Sample fatal message");
*/		
		
		PropertyConfigurator.configure("C:\\Users\\Shree\\eclipse-workspace\\Log4JModule\\src\\main\\java\\log4j.properties");		
//log.setLevel(Level.ALL);
		
		for (int i=0;i<10;i++){
			log.fatal("This is fatal msg");
			log.error("This is error msg");
			//log.log(MyOwnLevel.DISASTER, "my disaster message");
			log.warn("This is warn msg");
			log.info("This is info msg");
			log.debug("This is debug msg");
			log.trace("This is trace msg");
			TimeUnit.SECONDS.sleep(20);
			System.out.println("hi");
		}
		
	}

}
