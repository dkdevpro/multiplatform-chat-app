package dev.dinokodes.chatsdk

sealed class Response<out T> {
    class Success<out T>(val data: T) : Response<T>()
    data class Error(
        val exception: Throwable,
        val code: Int? = null,
        val error: Boolean? = null,
        val errorCollection: List<ErrorElement>? = null,
        val message: String? = null,
        val method: String? = null,
        val path: String? = null
    ) : Response<Nothing>()
}

data class ErrorElement(
    val message: String,
    val path: String
)