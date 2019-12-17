package ai.arturxdroid.nutritionhelper.ui.home_ask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ai.arturxdroid.nutritionhelper.R
import com.google.android.material.button.MaterialButton
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val answerTextView: TextView = root.findViewById(R.id.answer_text_view)
        val queryTextView: TextView = root.findViewById(R.id.ask_question_edit_text)

        homeViewModel.text.observe(this, Observer {
            answerTextView.text = it
        })

        homeViewModel.imageUrl.observe(this, Observer {
            Picasso.get().load(it).into(answer_image_view)
            answer_image_view.visibility = View.VISIBLE
        })

        val button = root.findViewById<MaterialButton>(R.id.ask_question_button)

        button.setOnClickListener {
            homeViewModel.fetchAnswer(queryTextView.text.toString())
        }
        return root
    }
}