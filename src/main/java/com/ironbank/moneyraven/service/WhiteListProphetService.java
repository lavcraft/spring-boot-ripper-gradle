package com.ironbank.moneyraven.service;

import com.ironbank.moneyraven.ProfileConstants;
import com.ironbank.moneyraven.model.ProphetProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author tolkv
 * @version 05/11/2017
 */
@Service
@Profile(ProfileConstants.ЗИМА_ТУТА)
@RequiredArgsConstructor
public class WhiteListProphetService implements ProphetService {
  private final ProphetProperties prophetProperties;

  @Override
  public boolean willSurvive(String name) {
    return prophetProperties.getТеКтоВозвращаютДолги().contains(name);
  }
}
