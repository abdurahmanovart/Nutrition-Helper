package ai.arturxdroid.nutritionhelper.ui.food_videos

import ai.arturxdroid.nutritionhelper.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class FoodVideosFragment : Fragment() {

    private lateinit var foodVideosViewModel: FoodVideosViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        foodVideosViewModel =
            ViewModelProviders.of(this).get(FoodVideosViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_food_videos, container, false)
        val textView: TextView = root.findViewById(R.id.text_tools)
        foodVideosViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}