package com.ironbank.moneyraven.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tolkv
 * @version 03/11/2017
 */
@Configuration
public class IronConfiguration {

  @Bean
  public IronListener ironListener() {
    return new IronListener();
  }

}
