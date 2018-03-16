package com.example.logonpf.carros.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URI

/**
 * Created by lucasdossantos on 3/10/18.
 */

object RetrofitClient {

    private var retrofit: Retrofit? = null

    fun getInstance(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                    .baseUrl("http://apicarroslucas.herokuapp.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit!!
    }
}
