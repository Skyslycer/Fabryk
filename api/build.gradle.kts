plugins {
    kotlin("jvm")
    id("io.papermc.paperweight.userdev")
}

group = "de.skyslycer.fabryk"
version = "0.1.0"

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    compileOnly(kotlin("stdlib"))
    paperDevBundle("1.18.1-R0.1-SNAPSHOT")
    compileOnly("net.axay:kspigot:1.18.0")
}