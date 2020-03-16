package com.springaws.paramstorepoc.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// This class can be defined in chasis and injected from there....
public class BaseConfiguration {
	
	 private String host;
	 private int port;

}
