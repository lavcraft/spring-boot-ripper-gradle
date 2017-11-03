package com.ironbank.moneyraven.starter;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import static org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase.PARSE_CONFIGURATION;
import static org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase.REGISTER_BEAN;

/**
 * @author tolkv
 * @version 03/11/2017
 */
public class OnRavenCondition extends AllNestedConditions {

  public OnRavenCondition() {
    super(REGISTER_BEAN);
  }

  @ConditionalOnProperty("ворон.куда-лететь")
  public static class OnDestinationCondition {
  }

  @ConditionalOnProperty(value = "ворон.вкл", havingValue = "true")
  public static class OnEnabledCondition {
  }
}
