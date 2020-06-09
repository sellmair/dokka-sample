import org.jetbrains.dokka.gradle.dokka

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.dokka")
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
