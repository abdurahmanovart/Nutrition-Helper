package ai.arturxdroid.nutritionhelper.ui.convert_amounts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ai.arturxdroid.nutritionhelper.R

class ConvertAmountsFragment : Fragment() {

    private lateinit var convertAmountsViewModel: ConvertAmountsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        convertAmountsViewModel =
            ViewModelProviders.of(this).get(ConvertAmountsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_convert, container, false)
        val textView: TextView = root.findViewById(R.id.text_share)
        convertAmountsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}