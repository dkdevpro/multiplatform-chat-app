package dev.dinokodes.chatsdk

import co.touchlab.kermit.Logger
import co.touchlab.kermit.NSLogLogger
import kotlin.system.getTimeMillis

actual fun getLogger(): Logger = NSLogLogger()

actual fun currentTimeMillis(): Long = getTimeMillis()
actual class ECDHUtils {
    actual fun generateKeyPair(): Array<String> {
        TODO("Not yet implemented")
    }
}

actual fun randomUUID(): String {
    TODO("Not yet implemented")
}

actual fun tojsonValue(type: Any): String {
    TODO("Not yet implemented")
}

actual fun fromjsonValue(
    message: String
): Any {
    TODO("Not yet implemented")
}

actual fun fromValue(message: String): Any {
    TODO("Not yet implemented")
}

actual fun fromValues(message: String): Any {
    TODO("Not yet implemented")
}

actual fun fromvalues(message: String): Any {
    TODO("Not yet implemented")
}