package dev.dinokodes.chatsdk


class JsSDK (configuration: Configuration, isDebug : Boolean) {
    private val sdk  = MultiplatformChatSDK.initializeWithConfig(
        configuration
    )
}

fun deviceId(): String = "JS Device ID"

fun getAbsolutePath() : String  = "JS file path for MQTT storage"

