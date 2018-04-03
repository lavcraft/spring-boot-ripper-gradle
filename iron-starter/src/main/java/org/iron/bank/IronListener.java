package org.iron.bank;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author tolkv
 * @version 05/11/2017
 */
@RequiredArgsConstructor
public class IronListener implements ApplicationListener<ContextRefreshedEvent> {
  private final RavenProperties ravenProperties;

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    System.out.println("послал ворона..." + ravenProperties.getКуда());
  }
}
