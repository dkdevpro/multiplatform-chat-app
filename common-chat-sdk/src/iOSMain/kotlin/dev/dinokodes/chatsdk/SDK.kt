package dev.dinokodes.chatsdk

import dev.dinokodes.chatsdk.adapter.AuthModuleAdapter

class IosSDK(isDebug: Boolean) {
    val sdk = MultiplatformChatSDKIOS()
    init {
        val config = Configuration(Builder())
        sdk.initializeWithConfig(
            config
        )
    }

    fun authModule() = AuthModuleAdapter()
}

