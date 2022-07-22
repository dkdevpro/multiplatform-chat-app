package dev.dinokodes.chatsdk

import co.touchlab.kermit.CommonLogger
import co.touchlab.kermit.Logger
import kotlin.js.Date

actual fun getLogger(): Logger = CommonLogger()

actual fun currentTimeMillis(): Long = Date().getTime().toLong()