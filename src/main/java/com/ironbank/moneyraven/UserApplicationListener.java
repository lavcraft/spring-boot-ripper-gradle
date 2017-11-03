package com.ironbank.moneyraven;

import com.ironbank.moneyraven.starter.IronListener;
import com.ironbank.moneyraven.starter.RavenProperties;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author tolkv
 * @version 04/11/2017
 */
@Component
public class UserApplicationListener extends IronListener {
  public UserApplicationListener(RavenProperties ravenProperties) {
    super(ravenProperties);
  }

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    System.out.println("send user customized raven");
  }
}
