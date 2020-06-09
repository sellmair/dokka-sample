import org.jetbrains.dokka.gradle.dokka

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.dokka")
}

kotlin {
    jvm()
    macosX64("macos")
}


dokka {
    dokkaSourceSets {
        create("commonMain") {
            reportUndocumented = true
        }
        create("jvmMain") {
            reportUndocumented = true
        }
        create("macosMain") {
            reportUndocumented = true
            platform = "native"
        }
    }
}