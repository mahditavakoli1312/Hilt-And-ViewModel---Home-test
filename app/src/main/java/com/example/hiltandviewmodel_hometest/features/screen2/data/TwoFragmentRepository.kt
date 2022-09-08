package com.example.hiltandviewmodel_hometest.features.screen2.data

interface TwoFragmentRepository {
    fun getData(): List<String>
    fun getDataById(id: Int): String

}