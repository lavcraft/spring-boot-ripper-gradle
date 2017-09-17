package com.ironbank.moneyraven;

import com.ironbank.moneyraven.configuration.ProphetProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProphetProperties.class)
public class MoneyRavenApplication {
	public static final String ЗИМА_БЛИЗКО = "зимаБлизко";
	public static final String ЗИМА_ТУТА = "зимаТута";

	public static void main(String[] args) {
		SpringApplication.run(MoneyRavenApplication.class, args);
	}
}
