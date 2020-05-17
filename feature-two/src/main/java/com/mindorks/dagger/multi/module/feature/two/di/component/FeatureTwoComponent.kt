package com.mindorks.dagger.multi.module.feature.two.di.component

import com.mindorks.dagger.multi.module.base.di.component.BaseComponent
import com.mindorks.dagger.multi.module.feature.two.FeatureTwoActivity
import com.mindorks.dagger.multi.module.feature.two.di.module.FeatureTwoModule
import com.mindorks.dagger.multi.module.feature.two.di.scopes.FeatureTwoScope
import dagger.Component

@FeatureTwoScope
@Component(
    dependencies = [BaseComponent::class],
    modules = [FeatureTwoModule::class]
)
interface FeatureTwoComponent {

    fun inject(activity: FeatureTwoActivity)

}