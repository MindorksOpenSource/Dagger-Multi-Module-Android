package com.mindorks.dagger.multi.module.feature.one

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mindorks.dagger.multi.module.base.data.DatabaseService
import com.mindorks.dagger.multi.module.base.data.NetworkService
import com.mindorks.dagger.multi.module.base.di.component.DaggerBaseComponent
import com.mindorks.dagger.multi.module.base.utils.InjectUtils
import com.mindorks.dagger.multi.module.feature.one.di.component.DaggerFeatureOneComponent
import javax.inject.Inject

class FeatureOneActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)

        DaggerFeatureOneComponent
            .builder()
            .baseComponent(InjectUtils.provideBaseComponent(applicationContext))
            .build()
            .inject(this)
        Log.d("DaggerSample_FeatureOne", databaseService.toString())

    }
}
