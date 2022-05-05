package dev.dinokodes.chatsdk

import com.russhwolf.settings.Settings

open class SDK internal constructor(
    private val defaultPageSize: Int = Companion.defaultPageSize,
    private val cacheLifetime: Long = Companion.cacheLifetime,
    private val isDebug: Boolean,
    private var settings: Settings
) {

    companion object {
        const val defaultPageSize: Int = 20
        const val cacheLifetime: Long = 300_000L
    }
}