plugins {
    java
    kotlin("jvm") version "2.2.21"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

group = "com.zyixh.code"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

sourceSets.main {
    java.srcDirs("src/main")
    kotlin.srcDirs("src/main")
}

sourceSets.test {
    java.srcDirs("src/test")
    kotlin.srcDirs("src/test")
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    implementation("com.google.guava:guava:32.0.1-android")
    runtimeOnly(kotlin("reflect"))
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.0")
}
