package com.ironbank.rules;

import com.ironbank.rules.annotation.RavenCondition;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tolkv
 * @since 9/17/2017
 */
@Configuration
public class IronBankConfiguration {

  @Bean
  @RavenCondition
  public ApplicationListener applicationListener() {
    return new IronBankApplicationListener();
  }

}
