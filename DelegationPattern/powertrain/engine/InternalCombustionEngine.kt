package com.minh.delegation.powertrain.engine

class InternalCombustionEngine : PowerSource {
    override fun increasePower() {
        println("Injecting fuel! Going vroooom!")
    }
}
