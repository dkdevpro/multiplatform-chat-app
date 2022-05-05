package dev.dinokodes.chatsdk

import co.touchlab.kermit.Logger


expect fun getLogger(): Logger

expect fun currentTimeMillis(): Long

expect class ECDHUtils {
    fun generateKeyPair(): Array<String>
}

expect fun randomUUID(): String

expect fun tojsonValue(type: Any): String

expect fun fromjsonValue(message: String): Any

expect fun fromValue(message: String): Any

expect fun fromValues(message: String): Any

expect fun fromvalues(message: String): Any