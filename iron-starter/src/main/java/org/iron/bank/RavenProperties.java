package org.iron.bank;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author tolkv
 * @version 05/11/2017
 */
@Data
@ConfigurationProperties("ворон")
public class RavenProperties {
  String куда;
}
