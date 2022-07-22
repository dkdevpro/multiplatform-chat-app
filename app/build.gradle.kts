plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = AndroidSdk.compile
    defaultConfig {
        applicationId = "dev.dinokodes.chatapp"
        minSdk = AndroidSdk.min
        targetSdk = AndroidSdk.target
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    lintOptions {
        isAbortOnError = false
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
//        freeCompilerArgs = listOf("-Xallow-jvm-ir-dependencies", "-Xskip-prerelease-check",
//                "-Xuse-experimental=kotlinx.coroutines.ExperimentalCoroutinesApi"
//        )
    }
}
repositories {
    mavenCentral()
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.1")
    implementation("io.reactivex.rxjava2:rxjava:2.2.9")
    implementation("io.reactivex.rxjava2:rxandroid:2.0.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")

    implementation(Compose.compiler)
    implementation(Compose.uiGraphics)
    implementation(Compose.uiTooling)
    //implementation(Compose.foundationLayout)
    implementation(Compose.material)
    //implementation(Compose.runtimeLiveData)
    implementation(Compose.navigation)
    //implementation(Compose.accompanist)

    //implementation(Koin.android)
    //implementation(Koin.androidViewModel)

    testImplementation("junit:junit:4.13.2")
   // testImplementation("androidx.test:core:1.3.0")
    //testImplementation("org.robolectric:robolectric:4.4")
    //androidTestImplementation("androidx.test:runner:1.3.0")

    implementation(project(":common-chat-sdk"))
    implementation(project(":multiplatform-compose"))

    //Glide
    implementation("com.github.bumptech.glide:glide:4.12.0")
    implementation("com.google.android.libraries.places:places:2.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}")




}
