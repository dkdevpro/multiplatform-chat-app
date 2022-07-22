package dev.dinokodes.chatsdk

import co.touchlab.kermit.LogcatLogger
import co.touchlab.kermit.Logger

actual fun getLogger(): Logger = LogcatLogger()

actual fun currentTimeMillis(): Long = System.currentTimeMillis()