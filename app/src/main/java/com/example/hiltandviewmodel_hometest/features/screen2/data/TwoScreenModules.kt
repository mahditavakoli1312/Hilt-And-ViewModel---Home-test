package com.example.hiltandviewmodel_hometest.features.screen2.data

import com.example.hiltandviewmodel_hometest.features.screen2.data.Impl.TwoFragmentRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class TwoScreenModules {

    @Binds
    abstract fun bindTwoFragmentRepository(twoFragmentRepoImpl: TwoFragmentRepoImpl): TwoFragmentRepository
}