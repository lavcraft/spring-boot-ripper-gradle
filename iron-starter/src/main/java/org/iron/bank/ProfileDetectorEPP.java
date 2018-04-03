package org.iron.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author tolkv
 * @version 05/11/2017
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ProfileDetectorEPP implements EnvironmentPostProcessor {
  private Object temperature;

  @Override
  public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
    if (getTemperature() < -300) {
      environment.addActiveProfile("зимаТута");
    } else {
      environment.addActiveProfile("зимаБлизко");
    }
  }

  public int getTemperature() {
    return -272;
  }
}
