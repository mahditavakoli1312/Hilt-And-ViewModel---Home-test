package com.example.hiltandviewmodel_hometest.features.screen2.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.hiltandviewmodel_hometest.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TwoFragment : Fragment() {

    //    private val args: TwoFragmentArgs by navArgs()
    private val viewModel: TwoFragmentViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView =
            view.findViewById<TextView>(R.id.tv_text_twoFragment)

        viewModel.number.observe(viewLifecycleOwner) {
            textView.text = "from OneFragment \n ${viewModel.number.value} -> ${
                viewModel.reverseData(
                    viewModel.number.value?.toInt() ?: 0
                )
            } "
        }
    }


}