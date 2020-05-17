package com.mindorks.dagger.multi.module.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mindorks.dagger.multi.module.R
import com.mindorks.dagger.multi.module.base.data.DatabaseService
import com.mindorks.dagger.multi.module.base.data.NetworkService
import com.mindorks.dagger.multi.module.base.di.component.DaggerBaseComponent
import com.mindorks.dagger.multi.module.base.utils.InjectUtils
import com.mindorks.dagger.multi.module.feature.one.FeatureOneActivity
import com.mindorks.dagger.multi.module.main.di.component.DaggerMainActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService
    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainActivityComponent
            .builder()
            .baseComponent(InjectUtils.provideBaseComponent(applicationContext))
            .build()
            .inject(this)
        Log.d("DaggerSample_Main", databaseService.toString())
        startActivity(Intent(this,FeatureOneActivity::class.java))

    }
}
