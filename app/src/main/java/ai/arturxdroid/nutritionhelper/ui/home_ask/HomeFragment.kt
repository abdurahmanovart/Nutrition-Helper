package ai.arturxdroid.nutritionhelper.ui.home_ask

import ai.arturxdroid.nutritionhelper.R
import ai.arturxdroid.nutritionhelper.databinding.AnswerBinding
import ai.arturxdroid.nutritionhelper.network.ApiFactory
import ai.arturxdroid.nutritionhelper.network.NutritionRepository
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.button.MaterialButton
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    lateinit var answerEditText:EditText

    lateinit var dialog:BottomSheetDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)

        val rootBind = AnswerBinding.inflate(inflater, container, false)
        answerEditText = rootBind.root.findViewById(R.id.ask_question_edit_text)

        rootBind?.homeViewModel = homeViewModel
        rootBind?.homeFragment = this
        rootBind?.lifecycleOwner  = this

        return rootBind?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog = BottomSheetDialog(activity?.applicationContext!!)
            .apply { setTitle(R.string.error_dialog_title)
            setContentView(R.layout.ask_error_dialog_layout)}


    }
}