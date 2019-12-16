package ai.arturxdroid.nutritionhelper.ui.plan_diet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ai.arturxdroid.nutritionhelper.R

class PlanDietFragment : Fragment() {

    private lateinit var planDietViewModel: PlanDietViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        planDietViewModel =
            ViewModelProviders.of(this).get(PlanDietViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_plan_diet, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        planDietViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}