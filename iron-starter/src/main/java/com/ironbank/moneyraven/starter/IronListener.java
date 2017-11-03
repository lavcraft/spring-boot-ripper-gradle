package com.ironbank.moneyraven.starter;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author tolkv
 * @version 03/11/2017
 */
@RequiredArgsConstructor
public class IronListener implements ApplicationListener<ContextRefreshedEvent> {
  private final RavenProperties ravenProperties;

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    ravenProperties.getКудаЛететь().forEach(s -> System.out.println("посылаю ворона в " + s));
  }
}
