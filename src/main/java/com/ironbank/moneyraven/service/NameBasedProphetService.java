package com.ironbank.moneyraven.service;

import com.ironbank.moneyraven.MoneyRavenApplication;
import com.ironbank.moneyraven.ProfileConstants;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author tolkv
 * @since 8/20/2017
 */
@Service
@Profile(ProfileConstants.ЗИМА_БЛИЗКО)
public class NameBasedProphetService implements ProphetService {

  @Override
  public boolean willSurvive(String name) {
    return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
  }

}
