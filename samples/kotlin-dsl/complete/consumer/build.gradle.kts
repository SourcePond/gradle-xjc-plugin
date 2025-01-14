plugins {
    java
    id("org.unbroken-dome.xjc") version "3.0.0"
}


xjc {
    enableIntrospection.set(true)
}


sourceSets.named("main") {
    xjcExtraArgs.addAll("-Xequals", "-XhashCode", "-XtoString")
}


dependencies {
    implementation(project(":library"))
    "xjcEpisodes"(project(":library"))

    "xjcClasspath"("org.jvnet.jaxb2_commons:jaxb2-basics:0.12.0")

    // The JAXB2 commons plugins require an additional compile/runtime dependency
    implementation("org.jvnet.jaxb2_commons:jaxb2-basics-runtime:0.12.0")
}
