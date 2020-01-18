package ai.arturxdroid.nutritionhelper.binding

import ai.arturxdroid.nutritionhelper.extensions.SpinnerExtensions
import ai.arturxdroid.nutritionhelper.extensions.SpinnerExtensions.setSpinnerEntries
import ai.arturxdroid.nutritionhelper.extensions.SpinnerExtensions.setSpinnerItemSelectedListener
import ai.arturxdroid.nutritionhelper.extensions.SpinnerExtensions.setSpinnerValue
import android.widget.Spinner
import androidx.databinding.BindingAdapter


class SpinnerBinding {

    @BindingAdapter("entries")
    fun Spinner.setEntries(entries: List<Any>) {
        setSpinnerEntries(entries)
    }

    @BindingAdapter("onItemSelected")
    fun Spinner.setOnItemSelectedListener(itemSelectedListener: SpinnerExtensions.ItemSelectedListener?) {
        setSpinnerItemSelectedListener(itemSelectedListener)
    }

    @BindingAdapter("newValue")
    fun Spinner.setNewValue(newValue: Any?) {
        setSpinnerValue(newValue)
    }
}