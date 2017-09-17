package com.ironbank.rules.condition;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import static org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase.REGISTER_BEAN;

/**
 * @author tolkv
 * @since 9/17/2017
 */
public class RavenCompositeCondition extends AllNestedConditions {
  public RavenCompositeCondition() {
    super(REGISTER_BEAN);
  }

  @ConditionalOnProperty(value = "ворон.куда")
  public static class OnRavenProperty {

  }

  @ConditionalOnProperty(value = "ворон.enabled", havingValue = "true", matchIfMissing = true)
  public static class OnRavenEnabled {

  }

}
