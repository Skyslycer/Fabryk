package de.skyslycer.fabryk

import de.skyslycer.fabryk.data.DataProvider

class FabrykImpl : Fabryk() {

    private val dataPath = this.dataFolder.toPath()

    private lateinit var dataProvider: DataProvider

    override fun load() {
        logger.info("Loading database and factories!")
    }

    override fun startup() {

    }

    private fun initDatabase() {

    }

    override fun dataProvider(): DataProvider = dataProvider

}