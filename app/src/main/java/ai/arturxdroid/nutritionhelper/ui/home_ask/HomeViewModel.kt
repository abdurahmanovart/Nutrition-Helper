package ai.arturxdroid.nutritionhelper.ui.home_ask

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

    val text: LiveData<String> = _text
    val imageUrl: LiveData<String> = _imageUrl

    fun fetchAnswer(query: String) {
        viewModelScope.launch {
            val answer = repository.getQuickAnswer(query)
            _text.value = answer?.answer
            if(answer?.image?.startsWith("http") == true)
                _imageUrl.value = answer?.image

        }
    }
}