plugins {
    java
    id("org.unbroken-dome.xjc") version "3.0.0"
}


dependencies {
    implementation(project(":episode-producer"))
    "xjcEpisodes"(project(":episode-producer"))
}
