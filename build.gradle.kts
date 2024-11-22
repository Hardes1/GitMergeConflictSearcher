plugins {
    kotlin("jvm") version "2.0.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.ajalt.clikt:clikt:5.0.1")
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/org.eclipse.jgit/org.eclipse.jgit
    implementation("org.eclipse.jgit:org.eclipse.jgit:7.0.0.202409031743-r")
    implementation("org.slf4j:slf4j-api:1.7.30")
//    implementation("org.apache.logging.log4j:org.apache.logging.log4j:2.20.0")
    // https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-slf4j-impl
    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:2.20.0")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}