package com.ironbank.moneyraven.service;

import com.ironbank.moneyraven.MoneyRavenApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author tolkv
 * @since 8/20/2017
 */
@Service
public class NameBasedProphetService implements ProphetService {

  @Override
  public boolean willSurvive(String name) {
    return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
  }

}
