package com.ironbank.moneyraven;

import com.ironbank.moneyraven.configuration.ProphetProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableConfigurationProperties(ProphetProperties.class)
public class MoneyRavenApplication {
	public static final String ЗИМА_БЛИЗКО = "зимаБлизко";
	public static final String ЗИМА_ТУТА = "зимаТута";

	@Autowired
  ApplicationContext applicationContext;

	public static void main(String[] args) {
    System.setProperty("java.awt.headless", "false");
    SpringApplication.run(MoneyRavenApplication.class, args);
  }
}
