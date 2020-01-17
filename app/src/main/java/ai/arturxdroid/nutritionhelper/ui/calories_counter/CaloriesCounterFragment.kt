package ai.arturxdroid.nutritionhelper.ui.calories_counter

import ai.arturxdroid.nutritionhelper.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

public class CaloriesCounterFragment : Fragment() {

    private lateinit var caloriesCounterViewModel: CaloriesCounterViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        caloriesCounterViewModel =
            ViewModelProviders.of(this).get(CaloriesCounterViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_calories, container, false)
        val textView: TextView = root.findViewById(R.id.text_calories)
        caloriesCounterViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}