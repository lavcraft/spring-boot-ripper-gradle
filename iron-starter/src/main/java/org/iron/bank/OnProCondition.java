package org.iron.bank;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

/**
 * @author tolkv
 * @version 05/11/2017
 */
public class OnProCondition implements Condition {
  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    return JOptionPane.showConfirmDialog(null, "это прдакшн?") == 0;
  }
}
