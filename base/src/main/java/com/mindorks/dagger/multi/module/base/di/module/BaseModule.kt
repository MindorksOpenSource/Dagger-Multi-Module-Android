package com.mindorks.dagger.multi.module.base.di.module

import com.mindorks.dagger.multi.module.base.data.DatabaseService
import com.mindorks.dagger.multi.module.base.data.NetworkService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseModule {

    @Provides
    @Singleton
    fun provideDatabaseService()=  DatabaseService()

    @Provides
    @Singleton
    fun provideNetworkService()= NetworkService()
}