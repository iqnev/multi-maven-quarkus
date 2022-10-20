# Multi-Maven-Quarkus

Project to reproduce Multi module maven project based on Quarkus

## Modules

### application

This module contains the quarkus maven plugin, it is aggregation module.

Integration tests are located on application module for not having to deal with dependency
inheritance.

Unit testing should be located on the relevant module, so you can test each individual component
separately.

### configuration

It is a single module that contains the configuration only and then you can add that as a dependency
to each module.

## How to run the project

On a terminal, under project root folder, run the following command:

```
./mvnw compile quarkus:dev
```

