import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    kotlin("jvm") version "1.6.0"
    kotlin("plugin.serialization") version "1.5.0"
    id("io.papermc.paperweight.userdev") version "1.3.4-SNAPSHOT"
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
    id("com.github.johnrengelman.shadow") version "7.1.1"
}

group = "de.skyslycer"
version = "0.1.0"

val exposedVersion = "0.34.1"

repositories {
    maven("https://papermc.io/repo/repository/maven-public/")
    mavenCentral()
}

dependencies {
    paperDevBundle("1.18.1-R0.1-SNAPSHOT")
    implementation("net.axay:kspigot:1.18.0")

    implementation("com.charleskorn.kaml:kaml:0.38.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.0")

    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")

    implementation(project(":api"))
}

tasks {
    withType<KotlinCompile>() {
        kotlinOptions.jvmTarget = "16"
    }

    build {
        dependsOn(reobfJar)
        dependsOn(shadowJar)
    }
}

bukkit {
    name = "Fabryk"
    load = BukkitPluginDescription.PluginLoadOrder.STARTUP
    main = "de.skysylcer.fabryk.FabrykImplKt"
    apiVersion = "1.18"
    authors = listOf("Skyslycer")
}