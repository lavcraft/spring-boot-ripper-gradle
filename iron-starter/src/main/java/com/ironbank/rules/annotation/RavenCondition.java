package com.ironbank.rules.annotation;

import com.ironbank.rules.condition.RavenCompositeCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author tolkv
 * @since 9/17/2017
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Conditional(RavenCompositeCondition.class)
public @interface RavenCondition {
}
