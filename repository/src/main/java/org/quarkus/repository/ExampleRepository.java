package org.quarkus.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExampleRepository implements PanacheRepository<ExampleEntity> {}
