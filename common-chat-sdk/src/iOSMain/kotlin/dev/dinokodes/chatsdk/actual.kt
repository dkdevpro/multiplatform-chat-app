package dev.dinokodes.chatsdk

import co.touchlab.kermit.Logger
import co.touchlab.kermit.NSLogLogger
import kotlin.system.getTimeMillis

actual fun getLogger(): Logger = NSLogLogger()

actual fun currentTimeMillis(): Long = getTimeMillis()

