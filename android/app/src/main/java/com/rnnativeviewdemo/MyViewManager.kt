package com.rnnativeviewdemo

import com.facebook.react.bridge.Arguments
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.common.MapBuilder
import com.facebook.react.uimanager.events.RCTEventEmitter

class MyViewManager : SimpleViewManager<MyView>() {

    override fun getName(): String {
        return "MyView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): MyView {
        return MyView(reactContext).apply {
            setOnPressEventListener {
                val map = Arguments.createMap()
                map.putString("dataFromNative","Hello!!!")
                reactContext.getJSModule(RCTEventEmitter::class.java)
                    .receiveEvent(id, "onPressEvent", map)
            }
        }
    }

    @ReactProp(name = "color")
    fun color(view: MyView, color: String?) {
        if (color != null) {
            view.setBackgroundColor(android.graphics.Color.parseColor(color))
        }
    }

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> {
        return MapBuilder.builder<String, Any>()
            .put("onPressEvent", MapBuilder.of("registrationName", "onPressEvent")).build()
    }
}