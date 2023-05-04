plugins {
  id("org.jetbrains.kotlin.jvm") version "1.8.10"
  id("io.gitlab.arturbosch.detekt").version("1.22.0-RC3")
  application
}

repositories {
  mavenCentral()
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(18))
  }
}

application {
  mainClass.set("simple.jdbc.AppKt")
}

dependencies {
  detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.22.0-RC3")
}

detekt {
  config = files("detekt.yml")
  autoCorrect = true
  buildUponDefaultConfig = true
}