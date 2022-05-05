package dev.dinokodes.chatsdk


import com.russhwolf.settings.ExperimentalSettingsImplementation
import dev.dinokodes.chatsdk.Configuration
import dev.dinokodes.chatsdk.SDK
import java.io.File

@ExperimentalSettingsImplementation
fun SDK.Companion.create(
    configuration: Configuration,
    isDebug: Boolean
) = dev.dinokodes.chatsdk.MultiplatformChatSDK.initializeWithConfig(
    configuration
)

fun deviceId(): String ="38jdjd9ej3093903030"

fun getAbsolutePath() : String {
    val root= "C:/Users/username"
    val myDir : File? = File("$root/MqttConnection")
    return myDir!!.absolutePath
}