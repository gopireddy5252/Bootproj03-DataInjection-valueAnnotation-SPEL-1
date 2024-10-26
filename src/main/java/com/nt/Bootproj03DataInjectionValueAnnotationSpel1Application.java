package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class Bootproj03DataInjectionValueAnnotationSpel1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Bootproj03DataInjectionValueAnnotationSpel1Application.class, args);
		
		Hotel hInfo=ctx.getBean("hotel",Hotel.class);
		System.out.println(hInfo);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
