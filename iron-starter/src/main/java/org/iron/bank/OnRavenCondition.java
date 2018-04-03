package org.iron.bank;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Condition;

/**
 * @author tolkv
 * @version 05/11/2017
 */
public class OnRavenCondition extends AllNestedConditions {
  public OnRavenCondition(ConfigurationPhase configurationPhase) {
    super(ConfigurationPhase.REGISTER_BEAN);
  }
  @ConditionalOnProperty("ворон.куда")
  static class  AA {}

  @ConditionalOnProperty("ворон.вкл")
  static class  BB {}


}
