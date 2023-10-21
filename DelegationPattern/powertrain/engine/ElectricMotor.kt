package com.minh.delegation.powertrain.engine

class ElectricMotor : PowerSource {
  override fun increasePower() {
    println("Increase electricity flow")
  }
}