package dev.dinokodes.chatsdk

import kotlin.native.concurrent.ThreadLocal


@ThreadLocal
object MultiplatformChatSDK {

    private var config: Configuration? = null

    /** Initialize all core elements  */
    fun initializeWithConfig(config: Configuration) {
    }

//    fun auth(): AuthenticationModule? {
//        return shared().moduleAdapter?.tenant()
//    }


    fun shared(): MultiplatformChatSDK {
        return this
    }

    private fun config(): Configuration? {
        return config
    }

    interface Params{
        val defaultPageSize: Int
            get() = 20
        val cacheLifetime: Long
            get() = 300_000L
    }
}