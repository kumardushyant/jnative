# Spring Boot native application build example

## Pre-requisites

Following installations are needed to execute this project
- JDK 17
- GraalVM 22.22
- Docker or Podman installation
- gcc on Linux environment
- Windows SDK on Windows environment

Currently project is tested on WSL2 Ubuntu

** Build

To build project locally, please run

```
gradle build nativeCompile
```

This command will create an executable at ``./build/native/nativeCompile/jnative``

To create a docker image locally, please run

```
gradle bootBuildImage
```

This will create a docker image locally with name ``jnative:1.0``