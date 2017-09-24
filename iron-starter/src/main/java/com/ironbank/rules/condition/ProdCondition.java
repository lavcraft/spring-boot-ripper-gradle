package com.ironbank.rules.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class ProdCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        int confirmation = showConfirmDialog(null, "Is Production?");

        return confirmation == 0;
    }
}
