package com.ironbank.moneyraven.starter;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase.PARSE_CONFIGURATION;
import static org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase.REGISTER_BEAN;

/**
 * @author tolkv
 * @version 03/11/2017
 */
@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {

  @Bean
  @ConditionalOnProduction
  @ConditionalOnRaven
  public IronListener ironListener(RavenProperties r) {
    return new IronListener(r);
  }
}
