package com.example.hiltandviewmodel_hometest.features.screen1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.hiltandviewmodel_hometest.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OneFragment : Fragment() {

    val viewModel: OneFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val action =
            OneFragmentDirections.actionOneFragmentToTwoFragment(fromOneFragment = viewModel.getData())

        val btnNavigate =
            view.findViewById<Button>(R.id.btn_navigate_twoFragment).setOnClickListener {
                findNavController().navigate(action)
            }

        val textView =
            view.findViewById<TextView>(R.id.tv_text_oneFragment).setText(viewModel.getData())
    }
}