package com.springaws.paramstorepoc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springaws.paramstorepoc.config.AppConfiguration;
import com.springaws.paramstorepoc.config.BaseConfiguration;

@RestController
@RequestMapping("/paramstore")
public class ParamStoreController {
	
	private AppConfiguration appConfiguration;
	
	private BaseConfiguration baseConfiguration;
	
	@GetMapping("/getconfig")
	public ResponseEntity<String> getConfig() {
		
		return new ResponseEntity (appConfiguration.toString() +"::"+baseConfiguration.toString(),HttpStatus.OK);
	}

	public ParamStoreController(AppConfiguration appConfiguration,BaseConfiguration baseConfiguration) {
		this.appConfiguration = appConfiguration;
		this.baseConfiguration= baseConfiguration;
	}

}
