package org.quarkus.configuration;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "service")
public interface ServiceConfig {
  String host();

  int port();
}
