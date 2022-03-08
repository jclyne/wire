plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
  id("com.squareup.wire")
}

android {
  compileSdkVersion(30)

  defaultConfig {
    applicationId = "com.square.wire.java.sample.myapplication"
    minSdkVersion(28)
    targetSdkVersion(30)
    versionCode = 1
    versionName = "1.0"
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
}

wire {
  kotlin {
    android = true
  }
}

dependencies {
  implementation("androidx.appcompat:appcompat:1.2.0")
  implementation("androidx.constraintlayout:constraintlayout:2.0.4")
}

buildscript {
  repositories {
    mavenCentral()
    google()
  }
  dependencies {
    classpath(deps.plugins.android)
    classpath("com.squareup.wire:wire-gradle-plugin")
  }
}
