package com.example.hiltandviewmodel_hometest.core.data

import javax.inject.Inject

class FakeData @Inject constructor() {

    fun getFakeData() = arrayOf("mahdi", "ali", "reza", "mohsen", "mohammad").toList()
}