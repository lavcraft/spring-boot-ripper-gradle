package com.ironbank.moneyraven.starter;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

/**
 * @author tolkv
 * @version 03/11/2017
 */
public class OnProductionCondition implements Condition {
  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    return JOptionPane.showConfirmDialog(null, "это продакшен?") == 0;
  }
}
