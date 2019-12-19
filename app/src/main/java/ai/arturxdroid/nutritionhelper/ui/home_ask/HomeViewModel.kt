package ai.arturxdroid.nutritionhelper.ui.home_ask

import ai.arturxdroid.nutritionhelper.data.AnswerResponse
import ai.arturxdroid.nutritionhelper.network.ApiFactory
import ai.arturxdroid.nutritionhelper.network.NutritionRepository
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val repository = NutritionRepository(ApiFactory.nutritionApi)

    private val _text = MutableLiveData<String>()
    private val _imageUrl = MutableLiveData<String>()
    private val _answerResponse = MutableLiveData<AnswerResponse>()

    val text: LiveData<String> = _text
    val imageUrl: LiveData<String> = _imageUrl
    val answerResponse:LiveData<AnswerResponse> = _answerResponse

    fun fetchAnswer(query: String) {
        viewModelScope.launch {
            _answerResponse.value = repository.getQuickAnswer(query)
            _text.value = answerResponse.value?.answer
            if(answerResponse.value?.image?.startsWith("http") == true)
                _imageUrl.value = answerResponse.value?.image
            

        }
    }
}