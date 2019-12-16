package ai.arturxdroid.nutritionhelper.ui.calories_counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CaloriesCounterViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Calories Counter Fragment"
    }
    val text: LiveData<String> = _text

}