package com.chandra.sampletestmoduleexample

import android.media.tv.TvContract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.chandra.logutils.LogUtils
import com.chandra.sampletestmoduleexample.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    val className:String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }




}
