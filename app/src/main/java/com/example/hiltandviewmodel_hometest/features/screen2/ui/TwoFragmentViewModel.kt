package com.example.hiltandviewmodel_hometest.features.screen2.ui

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.hiltandviewmodel_hometest.features.screen2.data.TwoFragmentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TwoFragmentViewModel @Inject constructor(
    val twoFragmentRepository: TwoFragmentRepository,
    savedStateHandle: SavedStateHandle

) : ViewModel() {

    private val _number = savedStateHandle.getLiveData<String>("fromOneFragment")
    private val _name =
        MutableLiveData(twoFragmentRepository.getData()[_number.value?.toInt() ?: 0])
    val number = _number
    val name = _name

    init {
        Handler().postDelayed({
            _number.value = "2"
            Handler().postDelayed({
                _number.value = "1"
                Handler().postDelayed({
                    _number.value = "0"
                }, 3000)
            }, 3000)
        }, 3000)
    }

    fun reverseData(number: Int) = twoFragmentRepository.getDataById(number)
}