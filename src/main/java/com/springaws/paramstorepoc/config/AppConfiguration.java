package com.springaws.paramstorepoc.config;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.aws.autoconfigure.paramstore.AwsParamStoreBootstrapConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties(prefix = "app")
public class AppConfiguration {
	private String authMethod;
	private String author;
	private List<String> urls = new ArrayList<>();

	private Map<String, String> technologies;
	
	private List<Menu> menus = new ArrayList<>();

	@ToString
	@Getter
	@Setter
	public static class Menu {
		private String name;
		private String path;
		private String title;

	}
	
	// This bean should be created at chasis level
		@Bean
		@ConfigurationProperties(prefix = "baseconfig")
		public BaseConfiguration baseConfiguration() {
			return new BaseConfiguration();
		}

}
