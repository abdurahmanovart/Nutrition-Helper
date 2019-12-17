package ai.arturxdroid.nutritionhelper.network

import ai.arturxdroid.nutritionhelper.data.AnswerResponse

class NutritionRepository(private val api: NutritionAPI) : BaseRepository() {

    suspend fun getQuickAnswer(query: String): AnswerResponse? {

        val response = safeApiCall(
            call = { api.getQuickAnswer(query = query,host = Constants.API_HEADER,key = Constants.API_KEY) },
            errorMessage = "Error getting quick answer"
        )

        return response



    }

}