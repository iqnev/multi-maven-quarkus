package org.quarkus.repository;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
class ExampleRepositoryTest {

  @Inject ExampleRepository exampleRepository;

  private void createOneRow() {
    final ExampleEntity e = new ExampleEntity();
    e.setCode("TEST");
    exampleRepository.persist(e);
  }

  @Test
  @Transactional
  public void getList() {
    createOneRow();

    final List<ExampleEntity> list = exampleRepository.listAll();
    Assertions.assertTrue(Objects.nonNull(list) && list.size() == 1);
  }
}
