buildscript {
    repositories {
        mavenCentral()
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        mavenLocal()
    }

    dependencies {
        classpath(kotlin("gradle-plugin:1.4-M2-eap-70"))
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.11.0-SNAPSHOT")
    }
}

allprojects {
    repositories {
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
        mavenLocal()
    }
}