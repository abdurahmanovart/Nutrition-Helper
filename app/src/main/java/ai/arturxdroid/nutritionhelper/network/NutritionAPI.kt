package ai.arturxdroid.nutritionhelper.network

import ai.arturxdroid.nutritionhelper.data.*
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

    @GET("recipes/search")
    suspend fun searchRecipes(
    @Header("x-rapidapi-host") host: String,
    @Header("x-rapidapi-key") key: String,
    @Query("query") query: String,
    @Query("cuisine") cuisine: String?,
    @Query("diet") diet: String,
    @Query("excludeIngredients") excludeIngridients: String?,
    @Query("intolerances") intolerances: String?,
    @Query("number") number:Int = 100
    ): Response<SearchRecipeResponse>
}