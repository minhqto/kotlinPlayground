package com.minh.delegation.vehicle

import com.minh.delegation.powertrain.engine.ElectricMotor
import com.minh.delegation.powertrain.engine.PowerSource

class TeslaModel3 : PowerSource by ElectricMotor() {
  fun goForward() {
    increasePower()
  }
}