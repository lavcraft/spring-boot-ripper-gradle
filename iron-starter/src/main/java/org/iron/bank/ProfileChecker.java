package org.iron.bank;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author tolkv
 * @version 05/11/2017
 */
public class ProfileChecker implements ApplicationContextInitializer {
  @Override
  public void initialize(ConfigurableApplicationContext applicationContext) {
    if (applicationContext.getEnvironment().getActiveProfiles().length == 0) {
      throw new RuntimeException("без профиля нельзя!");
    }
  }
}
