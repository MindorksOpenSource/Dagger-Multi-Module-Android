package com.mindorks.dagger.multi.module

import android.app.Application
import com.mindorks.dagger.multi.module.base.di.BaseComponentProvider
import com.mindorks.dagger.multi.module.base.di.component.BaseComponent
import com.mindorks.dagger.multi.module.base.di.component.DaggerBaseComponent
import com.mindorks.dagger.multi.module.base.di.module.BaseModule

class MyApplication : Application(), BaseComponentProvider {

    lateinit var baseComponent: BaseComponent

    override fun onCreate() {
        super.onCreate()

        baseComponent = DaggerBaseComponent
            .builder()
            .baseModule(BaseModule())
            .build()
        baseComponent.inject(this)
    }

    override fun provideBaseComponent(): BaseComponent {
        return baseComponent
    }

}