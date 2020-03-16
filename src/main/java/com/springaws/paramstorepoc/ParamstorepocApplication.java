package com.springaws.paramstorepoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParamstorepocApplication {

	public static void main(String[] args) {
		System.setProperty("aws.accessKeyId","");
        System.setProperty("aws.secretKey","");
        System.setProperty("aws.region","us-east-2");
		

		SpringApplication.run(ParamstorepocApplication.class, args);
	}

}
