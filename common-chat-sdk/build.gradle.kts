plugins {
    kotlin("multiplatform")
    id("kotlinx-serialization")
    id("android-setup")
    id("org.jetbrains.kotlin.native.cocoapods")
    id("com.chromaticnoise.multiplatform-swiftpackage") version "2.0.3"
}

version = "1.0"

kotlin {
    val sdkName: String? = System.getenv("SDK_NAME")

    val isiOSDevice = sdkName.orEmpty().startsWith("iphoneos")
    if (isiOSDevice) {
        iosArm64("iOS")
    } else {
        iosX64("iOS")
    }
    //ios()
    android()
    jvm()

    cocoapods {
        // Configure fields required by CocoaPods.
        summary = "Some description for a Kotlin/Native module"
        homepage = "Link to a Kotlin/Native module homepage"
    }

    js {
        browser {
        }
    }

    sourceSets {

        sourceSets["commonMain"].dependencies {
            // Coroutines
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}") {
                isForce = true
            }
           
            // koin
            //api(Koin.core)
            //api(Koin.test)

            // kermit
            api(Deps.kermit)

            implementation(Deps.Preference.settings)
            implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.32")
        }
        sourceSets["commonTest"].dependencies {
        }

        sourceSets["androidMain"].dependencies {
            implementation(SqlDelight.androidDriver)
            implementation("com.google.code.gson:gson:2.8.6")
        }
        sourceSets["androidTest"].dependencies {
            implementation(kotlin("test-junit"))
            implementation(Test.junit)
        }

        sourceSets["jvmMain"].dependencies {
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactive:1.4.2") {
                isForce = true
            }

            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.2.0") {
                isForce = true
            }
            implementation(SqlDelight.jdbcDriver)
            implementation(SqlDelight.sqlliteDriver)
            implementation("com.google.code.gson:gson:2.8.6")
        }

        sourceSets["iOSMain"].dependencies {
            //implementation(Ktor.clientIos)
            implementation(SqlDelight.nativeDriver)
        }
        sourceSets["iOSTest"].dependencies {
        }

        sourceSets["jsMain"].dependencies {
        }

    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}

multiplatformSwiftPackage {
    packageName("MultiplatformChat")
    swiftToolsVersion("5.3")
    targetPlatforms {
        iOS { v("13") }
    }
}


