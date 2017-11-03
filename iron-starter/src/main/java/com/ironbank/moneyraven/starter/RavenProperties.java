package com.ironbank.moneyraven.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author tolkv
 * @version 03/11/2017
 */
@Data
@ConfigurationProperties("ворон")
public class RavenProperties {
  List<String> кудаЛететь;
}
