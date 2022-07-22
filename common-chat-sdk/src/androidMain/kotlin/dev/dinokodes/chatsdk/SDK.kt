package dev.dinokodes.chatsdk

import android.annotation.SuppressLint
import android.content.Context
import android.provider.Settings
import java.io.File

fun SDK.Companion.create(
    context: Context,
    configuration: Configuration,
    isDebug: Boolean
) = MultiplatformChatSDK.initializeWithConfig(
    configuration,
)

fun getAbsolutePath(context : Context) : String {
    val root: String = context.getExternalFilesDir(null).toString()
    var myDir : File? = File("$root/MqttConnection")
    if(myDir == null){
        myDir = context.getDir("MqttConnection",Context.MODE_PRIVATE)
    }
    return myDir!!.absolutePath
}

@SuppressLint("HardwareIds")
fun deviceId(context: Context): String = Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)

