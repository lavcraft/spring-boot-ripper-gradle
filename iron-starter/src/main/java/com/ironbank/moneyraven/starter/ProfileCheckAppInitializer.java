package com.ironbank.moneyraven.starter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author tolkv
 * @version 04/11/2017
 */
public class ProfileCheckAppInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
  @Override
  public void initialize(ConfigurableApplicationContext applicationContext) {

    if (applicationContext.getEnvironment().getActiveProfiles().length == 0) {
      throw new RuntimeException("Нельзя без профиля!");
    }

  }
}
