plugins {
    kotlin("multiplatform") version "1.6.10"
}

group = "me.user"
version = "1.0"

repositories {
    google()
    mavenCentral()
}

kotlin {
    js(IR) {
        browser {}
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {}
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}
