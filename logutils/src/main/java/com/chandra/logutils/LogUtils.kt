package com.chandra.logutils

import android.util.Log

open class LogUtils {
   open fun d( logClass:String, logStr:String){
       Log.d(logClass,logStr)
    }
}