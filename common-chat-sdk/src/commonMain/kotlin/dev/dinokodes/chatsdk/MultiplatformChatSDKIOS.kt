package dev.dinokodes.chatsdk


class MultiplatformChatSDKIOS {

    private var config: Configuration? = null

    /** Initialize all core elements  */
    fun initializeWithConfig(config: Configuration) {
    }

    private fun getHeaderTimestamp(time: Long): String {
        return time.toString() + ""
    }

    fun connect() {

    }


    fun shared(): MultiplatformChatSDKIOS {
        return this
    }

    private fun config(): Configuration? {
        return shared().config
    }


    interface Params{
        val defaultPageSize: Int
            get() = 20
        val cacheLifetime: Long
            get() = 300_000L
    }
}