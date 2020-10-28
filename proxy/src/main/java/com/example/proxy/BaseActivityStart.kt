package com.example.proxy

import android.app.Activity
import android.app.Application
import android.os.Bundle

open class BaseActivityStart : ApplicationStart() {
    override fun onCreate() {
        super.onCreate()
        println("This is BaseActivityCalling")
    }
}