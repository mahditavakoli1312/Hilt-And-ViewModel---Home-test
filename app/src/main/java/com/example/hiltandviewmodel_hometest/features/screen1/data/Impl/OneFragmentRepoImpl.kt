package com.example.hiltandviewmodel_hometest.features.screen1.data.Impl

import com.example.hiltandviewmodel_hometest.features.screen1.data.OneFragmentDataSource
import com.example.hiltandviewmodel_hometest.features.screen1.data.OneFragmentRepository
import javax.inject.Inject

class OneFragmentRepoImpl @Inject constructor(
    private val oneFragmentDataSource: OneFragmentDataSource
) : OneFragmentRepository {

    override fun getData(): String {
        return oneFragmentDataSource.getData()
    }
}