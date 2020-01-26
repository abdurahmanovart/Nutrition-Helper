package ai.arturxdroid.nutritionhelper.ui.search_recipe

import ai.arturxdroid.nutritionhelper.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer

class SearchReceiptFragment : Fragment() {

    private val searchReceiptViewModel: SearchReceiptViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_search_receipt, container, false)
        val textView: TextView = root.findViewById(R.id.text_send)
        searchReceiptViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}