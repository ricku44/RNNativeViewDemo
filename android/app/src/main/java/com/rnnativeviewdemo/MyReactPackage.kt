package com.rnnativeviewdemo

import com.facebook.react.ReactPackage
import com.facebook.react.uimanager.ViewManager
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext

class MyReactPackage : ReactPackage {

    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
        return emptyList()
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return listOf(MyViewManager())
    }
}