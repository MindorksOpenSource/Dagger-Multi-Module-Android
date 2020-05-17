package com.mindorks.dagger.multi.module.base.di

import com.mindorks.dagger.multi.module.base.di.component.BaseComponent

interface BaseComponentProvider {

    fun provideBaseComponent(): BaseComponent

}