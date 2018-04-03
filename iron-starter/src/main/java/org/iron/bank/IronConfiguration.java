package org.iron.bank;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tolkv
 * @version 05/11/2017
 */
@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {
  @Bean
  @ConditionalOnProduction
  @ConditionalOnMissingBean
  public IronListener ironListener(RavenProperties ravenProperties) {
    return new IronListener(ravenProperties);
  }
}
