package com.example.hiltandviewmodel_hometest.features.screen2.data.Impl

import com.example.hiltandviewmodel_hometest.features.screen2.data.TwoFragmentDataSource
import com.example.hiltandviewmodel_hometest.features.screen2.data.TwoFragmentRepository
import javax.inject.Inject

class TwoFragmentRepoImpl @Inject constructor(
    val twoFragmentDataSource: TwoFragmentDataSource
) : TwoFragmentRepository {
    override fun getData(): List<String> {
        return twoFragmentDataSource.getData()
    }

    override fun getDataById(id: Int): String {
        return twoFragmentDataSource.getDataById(id)
    }
}