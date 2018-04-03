package com.ironbank.moneyraven;

import org.iron.bank.IronListener;
import org.iron.bank.RavenProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author tolkv
 * @version 05/11/2017
 */
@Component("ironListener")
public class WhiteRavenListener implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    System.out.println("event = " + event);
  }
}
