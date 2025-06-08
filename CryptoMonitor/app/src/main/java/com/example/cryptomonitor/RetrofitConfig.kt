package com.example.cryptomonitor

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitConfig {
    val service: CryptoService by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.mercadobitcoin.net/api/BTC/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CryptoService::class.javaObjectType) // <- esta é a correção
    }
}
