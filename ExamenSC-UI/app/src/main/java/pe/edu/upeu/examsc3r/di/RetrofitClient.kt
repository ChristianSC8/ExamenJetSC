package pe.edu.upeu.examsc3r.di

import com.google.gson.GsonBuilder
import pe.edu.upeu.examsc3r.Service.WebService
import pe.edu.upeu.examsc3r.constants.Const
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val webService: WebService by lazy {
        Retrofit.Builder()
            .baseUrl(Const.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(WebService::class.java)
    }
}