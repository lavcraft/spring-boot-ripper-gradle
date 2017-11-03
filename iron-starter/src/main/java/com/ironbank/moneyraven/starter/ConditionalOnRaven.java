package com.ironbank.moneyraven.starter;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author tolkv
 * @version 03/11/2017
 */
@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnRavenCondition.class)
public @interface ConditionalOnRaven {
}
