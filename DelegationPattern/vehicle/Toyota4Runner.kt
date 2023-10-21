package com.minh.delegation.vehicle

import com.minh.delegation.powertrain.engine.InternalCombustionEngine
import com.minh.delegation.powertrain.engine.PowerSource
import com.minh.delegation.powertrain.transmission.FiveSpeedTransmission
import com.minh.delegation.powertrain.transmission.MotorVehicleTransmissionSystem

class Toyota4Runner :
  PowerSource by InternalCombustionEngine(),
  MotorVehicleTransmissionSystem by FiveSpeedTransmission() {

  fun goForward() {
    increasePower()
    transferPower()
  }
}