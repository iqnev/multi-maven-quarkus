package org.quarkus.service;

import io.quarkus.test.junit.QuarkusTest;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ExampleServiceTest {

  @Inject ExampleService exampleService;

  @Test
  public void getList() {
    final List<String> list = exampleService.listAll();

    Assertions.assertTrue(Objects.nonNull(list) && list.size() == 1);
  }
}
