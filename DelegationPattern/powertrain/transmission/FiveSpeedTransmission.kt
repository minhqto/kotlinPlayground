package com.minh.delegation.powertrain.transmission

class FiveSpeedTransmission : MotorVehicleTransmissionSystem {
    override fun transferPower() {
        println("Transferring power from engine to driveshaft")
    }
}
