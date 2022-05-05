package dev.dinokodes.chatsdk.adapter

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.promise

class AuthModuleAdapter internal constructor(
) : CoroutineScope by CoroutineScope(Dispatchers.Main){

    @JsName("validateNameSpace")
    fun  validateNameSpace(namespace: String?) = promise {
    }
}