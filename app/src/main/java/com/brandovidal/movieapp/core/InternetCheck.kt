package com.brandovidal.movieapp.core

import android.util.Log
import kotlinx.coroutines.coroutineScope
import java.io.IOException
import java.lang.Exception
import java.net.InetSocketAddress
import java.net.Socket

object InternetCheck {

    suspend fun isNetworkAvailable() = coroutineScope {
        return@coroutineScope try {
            val sock = Socket()
            val socketAddress = InetSocketAddress("8.8.8.8", 53)
            sock.connect(socketAddress, 2000)
            sock.close()
            true
        } catch (e: Exception) {
            false
        }
    }
}