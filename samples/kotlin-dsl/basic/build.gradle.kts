plugins {
    java
    id("org.unbroken-dome.xjc") version "3.0.0"
}


repositories {
    mavenCentral()
}


dependencies {
    implementation("javax.xml.bind:jaxb-api:2.3.0")
}
