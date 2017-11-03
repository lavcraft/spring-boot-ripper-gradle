package com.ironbank.moneyraven;

import com.ironbank.moneyraven.model.ProphetProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ProphetProperties.class)
public class MoneyRavenApplication {

  @Bean
  public ApplicationListener ironListener() {
    return (event -> {
      System.out.println("event = " + event);
    });
  }

  public static void main(String[] args) {
    SpringApplication.run(MoneyRavenApplication.class, args);
  }
}
