package com.minh.delegation

import com.minh.delegation.vehicle.TeslaModel3
import com.minh.delegation.vehicle.Toyota4Runner

fun main() {
    val _4runner = Toyota4Runner()
    val teslaModel3 = TeslaModel3()

    _4runner.goForward()
    teslaModel3.goForward()
}