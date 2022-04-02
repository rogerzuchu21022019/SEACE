package team.hacker.seace.networks

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class API {
    companion object{
        val base_URL = "https://seace.congtydacap.club/"
        fun getAPI():Retrofit{
            return Retrofit.Builder()
                .baseUrl(base_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        }
    }

}