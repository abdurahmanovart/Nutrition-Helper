package ai.arturxdroid.nutritionhelper.ui.search_recipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ai.arturxdroid.nutritionhelper.R

class SearchReceiptFragment : Fragment() {

    private lateinit var searchReceiptViewModel: SearchReceiptViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        searchReceiptViewModel =
            ViewModelProviders.of(this).get(SearchReceiptViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_search_receipt, container, false)
        val textView: TextView = root.findViewById(R.id.text_send)
        searchReceiptViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}