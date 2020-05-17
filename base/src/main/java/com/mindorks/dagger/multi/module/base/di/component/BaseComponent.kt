package com.mindorks.dagger.multi.module.base.di.component

import android.app.Application
import com.mindorks.dagger.multi.module.base.data.DatabaseService
import com.mindorks.dagger.multi.module.base.data.NetworkService
import com.mindorks.dagger.multi.module.base.di.module.BaseModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BaseModule::class])
interface BaseComponent {

    fun inject(app: Application)

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

}