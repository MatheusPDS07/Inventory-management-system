package com.example.demo.firebase.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.example.demo")
@Data
public class FireBaseConfigurationProperties {

	private Configuration firebase = new Configuration();

	@Data
	public class Configuration {

		private String firebasePrivateKey;

	}

}