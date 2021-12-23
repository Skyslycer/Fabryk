package de.skyslycer.fabryk

import de.skyslycer.fabryk.data.DataProvider
import net.axay.kspigot.main.KSpigot

abstract class Fabryk : KSpigot() {

    abstract fun dataProvider(): DataProvider

}