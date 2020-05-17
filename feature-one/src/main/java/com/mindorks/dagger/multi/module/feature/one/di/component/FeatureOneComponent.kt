package com.mindorks.dagger.multi.module.feature.one.di.component

import com.mindorks.dagger.multi.module.base.di.component.BaseComponent
import com.mindorks.dagger.multi.module.feature.one.FeatureOneActivity
import com.mindorks.dagger.multi.module.feature.one.di.module.FeatureOneModule
import com.mindorks.dagger.multi.module.feature.one.di.scopes.FeatureOneScope
import dagger.Component

@FeatureOneScope
@Component(
    dependencies = [BaseComponent::class],
    modules = [FeatureOneModule::class]
)
interface FeatureOneComponent {

    fun inject(activity: FeatureOneActivity)

}