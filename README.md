# MultiplatformChat
<p>
<img src="https://img.shields.io/badge/STATUS-IN%20DEVELOPMENT-brightgreen" alt=""/>
</p>
**Multiplatform Chat** project using Jetpack Compose and SwiftUI.  Currently running on
* Android (Jetpack Compose)
* iOS (SwiftUI)
* Desktop (Compose for Desktop)
* Web (Kotlin/JS + React Wrapper)
* JVM

### Building
You need to use Android Studio Canary version.  Have tested on XCode v11 and v12.  When opening
iOS/watchOS/macOS projects remember to open `.xcworkspace` file (and not `.xcodeproj` one). To exercise web client run `./gradlew :web:browserDevelopmentRun`.

### Jetpack Compose for Desktop client

This client is available in `compose-desktop` module.  Note that you currently need to use EAP version of kotlin
plugin and also use appropriate JVM when running (works for example with Java 11)

### Languages, libraries and tools used

* [Kotlin](https://kotlinlang.org/)
* [Kotlin Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html)
* [Kotlinx Serialization](https://github.com/Kotlin/kotlinx.serialization)
* [Ktor client library](https://github.com/ktorio/ktor)
* [Android Architecture Components](https://developer.android.com/topic/libraries/architecture/index.html)
* [Koin](https://github.com/InsertKoinIO/koin)
* [Jetpack Compose](https://developer.android.com/jetpack/compose)
* [SwiftUI](https://developer.apple.com/documentation/swiftui)
