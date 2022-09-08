package com.example.hiltandviewmodel_hometest.features.screen1.ui

import androidx.lifecycle.ViewModel
import com.example.hiltandviewmodel_hometest.features.screen1.data.OneFragmentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OneFragmentViewModel @Inject constructor(
    private val oneFragmentRepository: OneFragmentRepository
) : ViewModel() {

    fun getData() = oneFragmentRepository.getData()
}