package dev.dinokodes.chatsdk

import co.touchlab.kermit.CommonLogger
import co.touchlab.kermit.Logger


actual fun getLogger(): Logger = CommonLogger()

actual fun currentTimeMillis(): Long = System.currentTimeMillis()