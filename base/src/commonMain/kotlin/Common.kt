package com.ht117.demomp

import io.ktor.client.HttpClient
import io.ktor.client.request.get

expect fun platformName(): String

fun getMessage(): String {
    return "Waving from ${platformName()}"
}

suspend fun callApi(): String {
    val client = HttpClient()
    return client.get("https://google.com")
}