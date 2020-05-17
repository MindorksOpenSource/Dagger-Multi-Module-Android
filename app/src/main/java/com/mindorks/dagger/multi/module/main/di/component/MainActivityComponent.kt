package com.mindorks.dagger.multi.module.main.di.component

import com.mindorks.dagger.multi.module.base.di.component.BaseComponent
import com.mindorks.dagger.multi.module.main.MainActivity
import com.mindorks.dagger.multi.module.main.di.module.MainActivityModule
import com.mindorks.dagger.multi.module.main.di.scopes.MainActivityScope
import dagger.Component

@MainActivityScope
@Component(
    dependencies = [BaseComponent::class],
    modules = [MainActivityModule::class]
)
interface MainActivityComponent {

    fun inject(activity: MainActivity)

}