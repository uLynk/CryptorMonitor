package com.example.cryptomonitor

import retrofit2.http.GET

interface CryptoService {
    @GET("ticker/")
    suspend fun getBitcoinPrice(): TickerModel
}
