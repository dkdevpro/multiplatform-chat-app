package dev.dinokodes.chatapp


import android.app.Application
import android.content.Context
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ProcessLifecycleOwner
import dev.dinokodes.chatsdk.Builder
import dev.dinokodes.chatsdk.Configuration
import dev.dinokodes.chatsdk.MultiplatformChatSDK

class MChatApplication : Application(), LifecycleObserver {

    override fun onCreate() {
        super.onCreate()
        val config = Configuration(Builder())
        MultiplatformChatSDK.initializeWithConfig(config)
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    private fun isInForeground(): Boolean {
        return ProcessLifecycleOwner.get().lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)
    }

}
