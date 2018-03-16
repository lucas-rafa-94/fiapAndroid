package com.example.logonpf.carros.api

import com.example.logonpf.carros.model.Carro
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by lucasdossantos on 3/10/18.
 *
 *
 */

interface CarroAPI{
    @GET("/carro")
    fun buscarTodos() : Call<List<Carro>>

    @POST("/carrp")
    fun salvar(@Body carro:Carro): Call<Void>

    fun salvar(): Call<Void>

}