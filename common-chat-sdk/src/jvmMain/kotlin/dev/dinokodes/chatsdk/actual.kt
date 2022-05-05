package dev.dinokodes.chatsdk

import co.touchlab.kermit.CommonLogger
import co.touchlab.kermit.Logger
import java.util.*


actual fun getLogger(): Logger = CommonLogger()

actual fun currentTimeMillis(): Long = System.currentTimeMillis()
actual class ECDHUtils{
    actual fun generateKeyPair(): Array<String> {
        TODO("Not yet implemented")
    }

}

actual fun randomUUID(): String= UUID.randomUUID().toString()
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