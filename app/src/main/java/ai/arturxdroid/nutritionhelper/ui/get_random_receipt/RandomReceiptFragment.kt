package ai.arturxdroid.nutritionhelper.ui.get_random_receipt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ai.arturxdroid.nutritionhelper.R

class RandomReceiptFragment : Fragment() {

    private lateinit var randomReceiptViewModel: RandomReceiptViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        randomReceiptViewModel =
            ViewModelProviders.of(this).get(RandomReceiptViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_random_receipt, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        randomReceiptViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}