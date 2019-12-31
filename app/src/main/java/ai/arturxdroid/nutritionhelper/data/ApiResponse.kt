package ai.arturxdroid.nutritionhelper.data

data class AnswerResponse(
    val answer: String,
    val image: String?,
    val type: String?
)

data class SearchRecipeResponse(
    val results: List<Recipe>,
    val offset: Int?,
    val totalResults: Int?
)

data class Recipe(
    val id: Int,
    val title: String,
    val readyInMinutes: Int,
    val servings: Int,
    val image: String
)
