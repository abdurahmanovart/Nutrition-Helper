package ai.arturxdroid.nutritionhelper.ui.plan_diet

import ai.arturxdroid.nutritionhelper.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

class PlanDietFragment : Fragment() {

    private val planDietViewModel: PlanDietViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_plan_diet, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        planDietViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}