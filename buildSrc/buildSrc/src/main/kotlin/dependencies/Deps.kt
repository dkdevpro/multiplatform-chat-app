package dependencies

object Deps {

  private const val path = "../commonFiles/gradleScript/"
  const val dependency = "./gradleScript/dependencies.gradle"

  object Facebook {
    val stetho = "com.facebook.stetho:stetho:${Version.stetho}"
  }

  object Firebase {
    val firebase_messaging = "com.google.firebase:firebase-messaging:20.1.7"
    val firebase_perf = "com.google.firebase:firebase-perf:19.0.7"
    val firebaseAnalytics = "com.google.firebase:firebase-analytics:17.4.1"
    val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics:17.0.0"
  }

  object Logging {
    val timber = "com.jakewharton.timber:timber:4.7.1"
  }
  object Glide {
    val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    val annotationProcessor = "androidx.annotation:annotation:1.0.0"
    val annotationCompiler = "com.github.bumptech.glide:compiler:${Version.glide}"
  }

  object Gson {
    val gson = "com.google.code.gson:gson:${Version.gson}"
  }

  object Kotlin {
    val anko_commons = "org.jetbrains.anko:anko-commons:${Version.anko}"
    val kotlin_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin}"
  }

  object LeakCanary {
    val leakcanary_debug = "com.squareup.leakcanary:leakcanary-android:${Version.leakCanary}"
    val leakcanary_release_no_op =
      "com.squareup.leakcanary:leakcanary-android-no-op:${Version.leakCanary}"
  }

  object Lifecycle {
    val extension = "android.arch.lifecycle:extensions:${Version.lifecycle}"
    val annotation_compliler = "android.arch.lifecycle:compiler:${Version.lifecycle}"
    val testing_core_testing = "android.arch.core:core-testing:${Version.lifecycle}"
  }

  object Lottie {
    val lottie = "com.airbnb.android:lottie:${Version.lottie}"
  }

  object HyperLink {
    val jsoup = "org.jsoup:jsoup:1.13.1"
  }

  object Material {
    val material = "com.google.android.material:material:${Version.material}"
  }

  object OkHttp3 {
    val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.retrofit_log}"
    val okHttp3 = "com.squareup.okhttp3:okhttp:3.12.1"
  }

  object Paging {
    val runtime = "androidx.paging:paging-runtime:${Version.paging}"
    val rxjava2 = "androidx.paging:paging-rxjava2:${Version.paging}"
    val testCommon = "androidx.paging:paging-common:${Version.paging}"
  }

  object Gms {
    val play_services_places = "com.google.android.libraries.places:places:${Version.placesApi}"
    val play_services_location =
      "com.google.android.gms:play-services-location:${Version.playServices}"
    val play_services_maps = "com.google.android.gms:play-services-maps:${Version.playServices}"
    val play_services_gms_places =
      "com.google.android.gms:play-services-places:${Version.playServices}"
  }

  object Retrofit2 {
    val adapterRxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${Version.retrofit}"
    val converterGson = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
  }

  object Room {
    //val annotationCompiler = "android.arch.persistence.room:compiler:${Version.room}"
    val runtime = "androidx.room:room-runtime:${Version.room}"
    val rxjava2 = "androidx.room:room-rxjava2:${Version.room}"
    val annotationProcessor = "androidx.room:room-compiler:${Version.room}"
  }

  object RxJava {
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Version.rxAndroid}"
    val rxjava2 = "io.reactivex.rxjava2:rxjava:${Version.rx}"
    val rxrelay2 = "com.jakewharton.rxrelay2:rxrelay:${Version.rxRelay}"
    val rxBinding = "com.jakewharton.rxbinding2:rxbinding:2.0.0"
    val rxBindingKotlin = "com.jakewharton.rxbinding2:rxbinding-kotlin:2.0.0"
  }

  object Socket {
    val socket_io_client = "io.socket:socket.io-client:1.0.0"
  }

  object AndroidXLibs {
    val fragment = "androidx.fragment:fragment:1.1.0"
    val annotationProcessor = "androidx.annotation:annotation:1.1.0"
    val archTesting = "androidx.arch.core:core-testing:2.1.0"
    val archCommon = "androidx.arch.core:core-common:2.1.0"
    val archRuntime = "androidx.arch.core:core-runtime:2.1.0"
    val core = "androidx.core:core:1.2.0"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    val materialDesign = "com.google.android.material:material:${Version.materialDesign}"
    val support_recyclerview_v7 = "androidx.recyclerview:recyclerview:1.1.0"
    val localbroadcastmanager =
      "androidx.localbroadcastmanager:localbroadcastmanager:1.0.0"
    val multidex = "androidx.multidex:multidex:2.0.0"
    val emoji = "androidx.emoji:emoji-appcompat:${Version.emoji_version}"
    val appCompat = "androidx.appcompat:appcompat:1.1.0"
  }

  object External {
    val roundedImage = "com.makeramen:roundedimageview:2.3.0"
    val textDrawable = "com.amulyakhare:com.amulyakhare.textdrawable:1.0.1"
    val emojiDecoder = "commons-lang:commons-lang:2.6"
    val streamAPI = "com.annimon:stream:1.2.1"
    val giphySDK = "com.giphy.sdk:ui:2.0.3-no-obfuscation"
  }

  object Test {
    // Junit
    val test_junit = "junit:junit:${Version.junit}"

    // Mockito
    val mockitoCore = "org.mockito:mockito-core:1.10.19"

    //mockk
    val mmockk = "io.mockk:mockk:1.10.2"

    //Room
    val android_test_room = "androidx.room:room-testing:${Version.room}"

    // Core library
    val androidxTestCore =  "androidx.test:core:1.0.0"

    // AndroidJUnitRunner and JUnit Rules
    val androidxTestRunner =  "androidx.test:runner:1.1.0"
    val androidxTestRules = "androidx.test:rules:1.1.0"

    // Assertions
    val androidxTestExt =  "androidx.test.ext:junit:1.1.1"
    val androidxTestTruth =  "androidx.test.ext:truth:1.0.0"
    val truth = "com.google.truth:truth:0.42"

    // Espresso dependencies
    val androidxEspressoCore =  "androidx.test.espresso:espresso-core:3.1.0"
    val androidxEspressoContrib =  "androidx.test.espresso:espresso-contrib:3.1.0"
    val androidxEspressoIntents =  "androidx.test.espresso:espresso-intents:3.1.0"
    val androidxEspressoaccessibility =  "androidx.test.espresso:espresso-accessibility:3.1.0"
    val androidxEspressowbe =  "androidx.test.espresso:espresso-web:3.1.0"
    val androidxEspressoIdling =  "androidx.test.espresso.idling:idling-concurrent:3.1.0"
    val androidxEspressoIdlingResource =  "androidx.test.espresso:espresso-idling-resource:3.1.0"
  }

  object Mqtt {
    val client = "org.eclipse.paho:org.eclipse.paho.client.mqttv3:1.2.0"
  }

  object KotlinXLibs {
    val kotlinAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.0.1"
  }
}
