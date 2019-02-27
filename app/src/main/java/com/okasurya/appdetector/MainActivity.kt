package com.okasurya.appdetector

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pm = packageManager
        val appList = pm.getInstalledApplications(PackageManager.GET_META_DATA)
        var list = ""
        for(app in appList) {
            list += app.packageName + "\n"
        }
        textApp.text = list
    }
}
