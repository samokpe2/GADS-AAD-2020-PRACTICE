package com.samokpe.gads2020.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import com.samokpe.gads2020.remote.RemoteDataSource
import com.samokpe.gads2020.remote.RemoteDataSourceImpl
import com.samokpe.gads2020.repositories.MainRepository
import com.samokpe.gads2020.repositories.MainRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule {
    @Singleton
    @Binds
    abstract fun provideRepository(mainRepositoryImpl: MainRepositoryImpl): MainRepository
    @Binds
    @Singleton
    abstract fun provideRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource
}