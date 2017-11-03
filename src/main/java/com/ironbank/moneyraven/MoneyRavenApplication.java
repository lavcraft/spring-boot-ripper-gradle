package com.ironbank.moneyraven;

import com.ironbank.moneyraven.model.ProphetProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(ProphetProperties.class)
public class MoneyRavenApplication {

  public static void main(String[] args) {
    SpringApplication.run(MoneyRavenApplication.class, args);
  }
}
