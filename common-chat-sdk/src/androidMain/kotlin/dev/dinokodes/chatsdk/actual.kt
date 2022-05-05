package dev.dinokodes.chatsdk

import co.touchlab.kermit.LogcatLogger
import co.touchlab.kermit.Logger
import com.google.gson.Gson
import java.util.*

actual fun getLogger(): Logger = LogcatLogger()

actual fun currentTimeMillis(): Long = System.currentTimeMillis()

actual class ECDHUtils {
    actual fun generateKeyPair(): Array<String> {
        TODO("Not yet implemented")
        }
}

actual fun randomUUID(): String = UUID.randomUUID().toString()

actual fun tojsonValue(type: Any): String {
   val gson = Gson()
    return gson.toJson(type)
}
val gson = Gson()
actual fun fromjsonValue(message: String): Any {
     return Any()
}

actual fun fromValue(message: String): Any {
    return Any()
}

actual fun fromValues(message: String): Any {
    return Any()
}

actual fun fromvalues(message: String): Any {
    return Any()
}