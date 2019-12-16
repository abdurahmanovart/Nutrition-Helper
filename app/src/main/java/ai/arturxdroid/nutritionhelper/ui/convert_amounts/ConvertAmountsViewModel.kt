package ai.arturxdroid.nutritionhelper.ui.convert_amounts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConvertAmountsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Convert Amounts Fragment"
    }
    val text: LiveData<String> = _text
}