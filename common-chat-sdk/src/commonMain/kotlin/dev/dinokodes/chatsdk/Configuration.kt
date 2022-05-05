package dev.dinokodes.chatsdk


class Configuration(builder: Builder) {
}

class Builder {
    fun build(): Configuration {
        return Configuration(this)
    }
}

