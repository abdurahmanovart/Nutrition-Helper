package ai.arturxdroid.nutritionhelper.ui.calories_counter

import ai.arturxdroid.nutritionhelper.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

public class CaloriesCounterFragment : Fragment() {

    private val caloriesCounterViewModel: CaloriesCounterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_calories, container, false)
        val textView: TextView = root.findViewById(R.id.text_calories)
        caloriesCounterViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}