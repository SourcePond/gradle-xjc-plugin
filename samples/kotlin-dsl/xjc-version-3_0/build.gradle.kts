plugins {
    java
    id("org.unbroken-dome.xjc") version "3.0.0"
}


repositories {
    mavenCentral()
}


xjc {
    xjcVersion.set("3.0")
}


dependencies {
    // XJC 3.0 requires a different JAXB API artifact
    implementation("jakarta.xml.bind:jakarta.xml.bind-api:3.0.0-RC3")
}
