package com.mindorks.dagger.multi.module.feature.two

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mindorks.dagger.multi.module.base.data.DatabaseService
import com.mindorks.dagger.multi.module.base.data.NetworkService
import com.mindorks.dagger.multi.module.base.di.component.DaggerBaseComponent
import com.mindorks.dagger.multi.module.base.utils.InjectUtils
import com.mindorks.dagger.multi.module.feature.two.di.component.DaggerFeatureTwoComponent
import javax.inject.Inject

class FeatureTwoActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_two)

        DaggerFeatureTwoComponent
            .builder()
            .baseComponent(InjectUtils.provideBaseComponent(applicationContext))
            .build()
            .inject(this)
        Log.d("DaggerSample_FeatureTwo", databaseService.toString())

    }
}
