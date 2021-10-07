import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.2.8.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
	kotlin("jvm") version "1.3.72"
	kotlin("plugin.spring") version "1.3.72"
}

group = "au.com.millsoftware"
version = System.getenv("APP_VERSION") ?: "1.0.0"

dependencies {

	implementation("org.springframework.boot:spring-boot-starter-web") {
		exclude("org.springframework.boot", "spring-boot-starter-tomcat")
	}
	implementation("org.springframework.boot:spring-boot-starter-undertow")
	implementation(kotlin("stdlib-jdk8"))
	// common spring services
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	// process property beans for IDE
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	// test dependencies
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		 // junit 4 is excluded - we use junit 5
		exclude(group = "junit", module = "junit")
	}
}
repositories {
	mavenCentral()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
	jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
	jvmTarget = "1.8"
}