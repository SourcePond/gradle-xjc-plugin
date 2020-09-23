plugins {
    java
    id("org.unbroken-dome.xjc") version "2.0.0"
}


repositories {
    jcenter()
}


xjc {
    xjcVersion.set("2.2")
}


dependencies {
    implementation("javax.xml.bind:jaxb-api:2.2.12")
}
