package com.springaws.paramstorepoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParamstorepocApplication {

	public static void main(String[] args) {
		System.setProperty("aws.accessKeyId","AKIAJNCJOGNRGGZP7X5A");
        System.setProperty("aws.secretKey","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");
        System.setProperty("aws.region","us-east-2");
		
       //.setProperty("cloud.aws.credentials.access-key","bNrz+BANm8CQe2PqVGHZC2aPvoZnaMTchMn43P6A");

		SpringApplication.run(ParamstorepocApplication.class, args);
	}

}
