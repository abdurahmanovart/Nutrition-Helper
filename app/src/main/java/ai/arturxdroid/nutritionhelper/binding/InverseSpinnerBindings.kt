package ai.arturxdroid.nutritionhelper.binding

import ai.arturxdroid.nutritionhelper.extensions.SpinnerExtensions.getSpinnerValue
import ai.arturxdroid.nutritionhelper.extensions.SpinnerExtensions.setSpinnerInverseBindingListener
import ai.arturxdroid.nutritionhelper.extensions.SpinnerExtensions.setSpinnerValue
import android.widget.Spinner
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener


class InverseSpinnerBindings {

    @BindingAdapter("selectedValue")
    fun Spinner.setSelectedValue(selectedValue: Any?) {
        setSpinnerValue(selectedValue)
    }

    @BindingAdapter("selectedValueAttrChanged")
    fun Spinner.setInverseBindingListener(inverseBindingListener: InverseBindingListener?) {
        setSpinnerInverseBindingListener(inverseBindingListener)
    }

    companion object InverseSpinnerBindings {
        @JvmStatic
        @InverseBindingAdapter(attribute = "selectedValue", event = "selectedValueAttrChanged")
        fun Spinner.getSelectedValue(): Any? {
            return getSpinnerValue()
        }
    }
}