package com.pack.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
@SpringBootApplication(scanBasePackages="com.pack")
public class Application {
	public static void  main(String args[])
	{
		SpringApplication.run(Application.class, args);
	}
	/*@Bean
	public  ResourceBundleMessageSource   messageSource() {
		ResourceBundleMessageSource  ms = new ResourceBundleMessageSource();
		ms.setBasename("error_messages");
		return  ms;
	}*/
}
