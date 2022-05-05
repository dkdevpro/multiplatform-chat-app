package dev.dinokodes.chatapp.compose

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import dev.dinokodes.chatsdk.Builder
import dev.dinokodes.chatsdk.Configuration
import dev.dinokodes.chatsdk.SDK
import dev.dinokodes.chatsdk.create

val config = Configuration(Builder())

@OptIn(ExperimentalComposeUiApi::class)
fun main() = singleWindowApplication(
    title = "KMP Chat window",
    state = WindowState(size = DpSize(800.dp, 800.dp))
) {
    SDK.create(
        config,
        true
    )
}
