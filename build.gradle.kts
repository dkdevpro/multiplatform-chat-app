buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
        gradlePluginPortal()
        maven(uri("https://plugins.gradle.org/m2/")) // For kotlinter-gradle
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.3")
    }
}

//allprojects {
//    repositories {
//        google()
//        mavenCentral()
//        jcenter()
//        maven(url = "https://kotlin.bintray.com/kotlin-js-wrappers/")
//        maven(url = "https://jitpack.io")
//    }
//}

plugins {
    `kotlin-dsl`
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenLocal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}


