package ai.arturxdroid.nutritionhelper.ui.food_videos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FoodVideosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Food Videos Fragment"
    }
    val text: LiveData<String> = _text
}