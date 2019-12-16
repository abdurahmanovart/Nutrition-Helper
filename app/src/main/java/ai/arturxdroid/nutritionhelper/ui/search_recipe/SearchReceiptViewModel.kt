package ai.arturxdroid.nutritionhelper.ui.search_recipe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchReceiptViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Search Receipt Fragment"
    }
    val text: LiveData<String> = _text
}