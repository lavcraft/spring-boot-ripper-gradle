package com.ironbank.rules;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author tolkv
 * @since 9/17/2017
 */
public class IronBankApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {

    System.out.println("event = " + event);

  }

}
