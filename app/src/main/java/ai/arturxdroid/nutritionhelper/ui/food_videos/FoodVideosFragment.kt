package ai.arturxdroid.nutritionhelper.ui.food_videos

import ai.arturxdroid.nutritionhelper.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

class FoodVideosFragment : Fragment() {

    private val foodVideosViewModel: FoodVideosViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_food_videos, container, false)
        val textView: TextView = root.findViewById(R.id.text_tools)
        foodVideosViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}