plugins {
	java
	id("org.springframework.boot") version "3.0.0"
	id("io.spring.dependency-management") version "1.1.0"
	id("org.graalvm.buildtools.native") version "0.9.18"
}

group = "tut.dushyant.jnative"
version = "1.0"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	maven { url = uri("https://repo.spring.io/release") }
	mavenCentral()	
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

