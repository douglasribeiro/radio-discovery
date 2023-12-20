package com.douglas.developer.radio.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RadioDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadioDiscoveryApplication.class, args);
	}
}

//Teste alteração branch
//Outra alteração
//Terceira
//NovoRamoApartirDaDevelop