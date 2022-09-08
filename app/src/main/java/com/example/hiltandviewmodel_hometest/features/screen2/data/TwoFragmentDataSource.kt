package com.example.hiltandviewmodel_hometest.features.screen2.data

import com.example.hiltandviewmodel_hometest.core.data.FakeData
import javax.inject.Inject

class TwoFragmentDataSource @Inject constructor() {

    fun getData() = FakeData().getFakeData()
    fun getDataById(id: Int) = FakeData().getFakeData()[id]

}