package com.example.springcloudhelloconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.example.springcloudhelloconsul")
public class SpringCloudHelloConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHelloConsulApplication.class, args);
	}

}
