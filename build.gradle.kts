plugins {
  id("java")
  id("com.apollographql.apollo").version("2.5.9")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.apollographql.apollo:apollo-api:2.5.9")
}