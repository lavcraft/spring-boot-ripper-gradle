package com.ironbank.moneyraven.service;

import com.ironbank.moneyraven.MoneyRavenApplication;
import com.ironbank.moneyraven.configuration.ProphetProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author tolkv
 * @since 9/17/2017
 */
@Service
@Profile(MoneyRavenApplication.ЗИМА_ТУТА)
@RequiredArgsConstructor
public class WhiteListProphetService implements ProphetService {
  private final ProphetProperties prophetProperties;

  @Override
  public boolean willSurvive(String name) {
    return prophetProperties.getТеКтоВозвращаютДолги().contains(name);
  }

}
