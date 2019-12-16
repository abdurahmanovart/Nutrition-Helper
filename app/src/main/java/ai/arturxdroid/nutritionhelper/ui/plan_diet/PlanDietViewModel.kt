package ai.arturxdroid.nutritionhelper.ui.plan_diet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlanDietViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Plan Diet Fragment"
    }
    val text: LiveData<String> = _text
}