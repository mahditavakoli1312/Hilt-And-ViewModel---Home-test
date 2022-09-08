package com.example.hiltandviewmodel_hometest.features.screen1.data

import com.example.hiltandviewmodel_hometest.features.screen1.data.Impl.OneFragmentRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class OneSreenModuls {

    @Binds
    abstract fun getOneSceenRepo(oneFragmentRepo: OneFragmentRepoImpl): OneFragmentRepository
}