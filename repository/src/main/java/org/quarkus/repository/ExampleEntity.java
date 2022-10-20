package org.quarkus.repository;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "example")
@Data
public class ExampleEntity extends PanacheEntity {

  private String code;
}
