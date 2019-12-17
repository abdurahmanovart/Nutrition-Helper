package ai.arturxdroid.nutritionhelper.network

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import com.squareup.moshi.Moshi
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {

    const val BASE_URL = "https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com"

    private val authInterceptor = Interceptor{ chain->
        val newUrl = chain.request().url()
            .newBuilder()
            //.addQueryParameter("x-rapidapi-key",Constants.API_KEY)
            //.addQueryParameter("x-rapidapi-host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
            .build()

        val newRequest = chain.request()
            .newBuilder()
            .url(newUrl)
            .build()

        chain.proceed(newRequest)

    }

    private val client = OkHttpClient().newBuilder()
        .addInterceptor(authInterceptor)
        .build()

    fun retrofit():Retrofit = Retrofit.Builder()
        .client(client)
        .baseUrl(BASE_URL)
//        .addConverterFactory(retrofit2.converter.moshi.MoshiConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val nutritionApi = retrofit().create(NutritionAPI::class.java)
}