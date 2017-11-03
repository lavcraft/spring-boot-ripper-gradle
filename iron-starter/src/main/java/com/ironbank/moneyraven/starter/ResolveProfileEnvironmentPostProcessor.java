package com.ironbank.moneyraven.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author tolkv
 * @version 04/11/2017
 */
public class ResolveProfileEnvironmentPostProcessor implements EnvironmentPostProcessor {
  @Override
  public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
    if (getTemperature() < -272) {
      environment.setActiveProfiles("зимаТута");
    } else {
      environment.setActiveProfiles("зимаБлизко");

    }
  }

  private int getTemperature() {
    return -300;
  }
}
