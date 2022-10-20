package org.quarkus.service;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.quarkus.configuration.ServiceConfig;
import org.quarkus.repository.ExampleEntity;
import org.quarkus.repository.ExampleRepository;

@ApplicationScoped
public class ExampleService {

  @Inject ExampleRepository exampleRepository;

  @Inject ServiceConfig serviceConfig;

  public List<String> listAll() {
    final List<String> result =
        exampleRepository.findAll().stream().map(ExampleEntity::getCode).toList();

    return List.of(serviceConfig.host());
  }
}
