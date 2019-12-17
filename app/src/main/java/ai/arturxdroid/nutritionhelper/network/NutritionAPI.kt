package ai.arturxdroid.nutritionhelper.network

import ai.arturxdroid.nutritionhelper.data.AnswerResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface NutritionAPI {

    @GET("recipes/quickAnswer")
    suspend fun getQuickAnswer(
        @Header("x-rapidapi-host") host: String,
        @Header("x-rapidapi-key") key: String,
        @Query("q") query: String
    ): Response<AnswerResponse>

}