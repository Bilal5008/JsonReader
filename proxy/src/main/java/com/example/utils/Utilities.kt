package com.example.utils

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import android.util.DisplayMetrics
import android.view.WindowManager


class  Utilities {

    companion object {
        var actionIndex: Int = 0
        var bounds: String? = null
        var gUID: String? = null
        var packageName: String? = null
        var file64Byte: String? = null

        fun getScreenResolution(context: Activity?): String? {
            val wm = context?.application?.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val display = wm.defaultDisplay
            val metrics = DisplayMetrics()
            display.getMetrics(metrics)
            val width = metrics.widthPixels
            val height = metrics.heightPixels
            return "${width}x${height}"
        }

        fun getRamForDevice(context: Activity?): Long {
            val actManager = context!!.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
            val memInfo = ActivityManager.MemoryInfo()
            actManager.getMemoryInfo(memInfo)
            return memInfo.totalMem
        }

        fun formatSize(v: Long): String? {
            if (v < 1024) return "$v B"
            val z = (63 - java.lang.Long.numberOfLeadingZeros(v)) / 10
            return String.format("%.1f %sB", v.toDouble() / (1L shl z * 10), " KMGTPE"[z])
        }

    }


}