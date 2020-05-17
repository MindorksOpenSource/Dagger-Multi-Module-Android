package com.mindorks.dagger.multi.module.base.utils

import android.content.Context
import com.mindorks.dagger.multi.module.base.di.BaseComponentProvider
import com.mindorks.dagger.multi.module.base.di.component.BaseComponent

object InjectUtils {

    fun provideBaseComponent(applicationContext: Context): BaseComponent {
        return if (applicationContext is BaseComponentProvider) {
            (applicationContext as BaseComponentProvider).provideBaseComponent()
        } else {
            throw IllegalStateException("Provide the application context which implement BaseComponentProvider")
        }
    }

}