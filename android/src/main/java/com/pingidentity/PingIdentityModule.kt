package com.pingidentity

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = PingIdentityModule.NAME)
class PingIdentityModule(reactContext: ReactApplicationContext) :
  NativePingIdentitySpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

  companion object {
    const val NAME = "PingIdentity"
  }
}
