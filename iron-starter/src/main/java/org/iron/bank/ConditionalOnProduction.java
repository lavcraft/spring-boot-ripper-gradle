package org.iron.bank;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author tolkv
 * @version 05/11/2017
 */
@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnProCondition.class)
public @interface ConditionalOnProduction {
}
