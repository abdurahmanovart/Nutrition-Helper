package ai.arturxdroid.nutritionhelper.ui.get_random_receipt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomReceiptViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Random Receipt Fragment"
    }
    val text: LiveData<String> = _text
}