object Versions {
    const val kotlin = "1.6.20"  //-2
    const val kotlinCoroutines = "1.6.1"
    const val ktor = "2.0.0"
    const val kotlinxSerialization = "1.0.1"
    const val koin = "3.0.1-beta-1"
    const val sqlDelight = "1.5.3"
    const val kermit = "0.1.8"

    const val sqliteJdbcDriver = "3.30.1"
    const val slf4j = "1.7.30"
    const val compose = "1.2.0-alpha08" //1.0.0-alpha12
    const val composeCompiler = "1.2.0-alpha08"
    const val composeDesktopWeb = "0.0.0-master-dev673"
    const val wearCompose = "1.0.0-alpha21"
    const val navCompose = "2.4.2"
    const val accompanist = "0.23.0"
    const val composeIos = "0.0.0-master-dev673"

    const val settings = "0.7.3"
    const val junit = "4.13"
    const val testRunner = "1.3.0"

    const val androidMinSdk = 21
    const val androidCompileSdk = 31
    const val androidTargetSdk = androidCompileSdk
}


object AndroidSdk {
    const val min = 21
    const val compile = 31
    const val target = compile
}

object Deps {
    const val kermit = "co.touchlab:kermit:${Versions.kermit}"

    object JetBrains {
        object Kotlin {
            // __KOTLIN_COMPOSE_VERSION__
            const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
            const val testCommon = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
            const val testJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
            const val testAnnotationsCommon = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
            const val kotlinAndroidExtentions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"
        }

        object Compose {
            // __LATEST_COMPOSE_RELEASE_VERSION__
            private const val VERSION = "1.1.0"
            const val gradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:$VERSION"
        }
    }

    object Android {
        object Tools {
            object Build {
                const val gradlePlugin = "com.android.tools.build:gradle:7.1.3"  //7.0.0-alpha07
            }
        }
    }

    object AndroidX {
        object AppCompat {
            const val appCompat = "androidx.appcompat:appcompat:1.1.0"
        }
        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.3.0-alpha02"
        }

        object MultiDex{
            val multidex = "androidx.multidex:multidex:2.0.0"
        }
    }

    object ArkIvanov {
        object MVIKotlin {
            private const val VERSION = "2.0.0"
            const val rx = "com.arkivanov.mvikotlin:rx:$VERSION"
            const val mvikotlin = "com.arkivanov.mvikotlin:mvikotlin:$VERSION"
            const val mvikotlinMain = "com.arkivanov.mvikotlin:mvikotlin-main:$VERSION"
            const val mvikotlinMainIosX64 = "com.arkivanov.mvikotlin:mvikotlin-main-iosx64:$VERSION"
            const val mvikotlinMainIosArm64 = "com.arkivanov.mvikotlin:mvikotlin-main-iosarm64:$VERSION"
            const val mvikotlinLogging = "com.arkivanov.mvikotlin:mvikotlin-logging:$VERSION"
            const val mvikotlinTimeTravel = "com.arkivanov.mvikotlin:mvikotlin-timetravel:$VERSION"
            const val mvikotlinExtensionsReaktive = "com.arkivanov.mvikotlin:mvikotlin-extensions-reaktive:$VERSION"
        }

        object Decompose {
            private const val VERSION = "0.1.7"
            const val decompose = "com.arkivanov.decompose:decompose:$VERSION"
            const val decomposeIosX64 = "com.arkivanov.decompose:decompose-iosx64:$VERSION"
            const val decomposeIosArm64 = "com.arkivanov.decompose:decompose-iosarm64:$VERSION"
            const val extensionsCompose = "com.arkivanov.decompose:extensions-compose-jetbrains:$VERSION"
        }
    }

    object Badoo {
        object Reaktive {
            private const val VERSION = "1.1.19"
            const val reaktive = "com.badoo.reaktive:reaktive:$VERSION"
            const val reaktiveTesting = "com.badoo.reaktive:reaktive-testing:$VERSION"
            const val utils = "com.badoo.reaktive:utils:$VERSION"
            const val coroutinesInterop = "com.badoo.reaktive:coroutines-interop:$VERSION"
        }
    }

    object Squareup {
        object SQLDelight {
            const val gradlePlugin = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
            const val androidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
            const val sqliteDriver = "com.squareup.sqldelight:sqlite-driver:${Versions.sqlDelight}"
            const val nativeDriver = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
        }
    }

    object Preference {
        const val settings = "com.russhwolf:multiplatform-settings:${Versions.settings}"
    }
}

object Test {
    const val junit = "junit:junit:${Versions.junit}"
}

object Compose {
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.navCompose}"
    const val accompanist= "dev.chrisbanes.accompanist:accompanist-coil:${Versions.accompanist}"
    const val compiler= "androidx.compose.compiler:compiler:${Versions.composeCompiler}"
}

object Koin {
    val core = "org.koin:koin-core:${Versions.koin}"
    val test = "org.koin:koin-test:${Versions.koin}"
    val android = "org.koin:koin-android:${Versions.koin}"
    val androidViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
}

object Ktor {
    val clientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
    val clientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
    val clientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
    val clientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
    val clientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
    val clientApache = "io.ktor:ktor-client-apache:${Versions.ktor}"
    val clientOkHttp = "io.ktor:ktor-client-okhttp:${Versions.ktor}"
    val slf4j = "org.slf4j:slf4j-simple:${Versions.slf4j}"
    val clientIos = "io.ktor:ktor-client-ios:${Versions.ktor}"
    val clientCio = "io.ktor:ktor-client-cio:${Versions.ktor}"
    val clientJs = "io.ktor:ktor-client-js:${Versions.ktor}"
    val contentNegotiation = "io.ktor:ktor-client-content-negotiation:${Versions.ktor}"
}

object Serialization {
    val core = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinxSerialization}"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
}

object SqlDelight {
    val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
    val coroutineExtensions = "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
    val androidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
    val nativeDriver = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
    val nativeDriverMacos = "com.squareup.sqldelight:native-driver-macosx64:${Versions.sqlDelight}"
    val jdbcDriver = "org.xerial:sqlite-jdbc:${Versions.sqliteJdbcDriver}"
    val sqlliteDriver = "com.squareup.sqldelight:sqlite-driver:${Versions.sqlDelight}"
}

