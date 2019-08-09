package com.latitude.challenge

import com.latitude.challenge.model.Stock

object Fixture {

    object StockPrices {

        val INCREMENTAL_STOCK_PRICES = listOf(1, 2, 4, 5)

        val DECREASING_STOCK_PRICES = listOf(50, 30, 20, 12, 8, 2)

        val MULTIPLE_SPIKES_IN_STOCK_PRICES = listOf(2, 3, 4, 5, 1, 2, 3, 1, 2)

        val CONSISTENT_STOCK_PRICES = listOf(20, 20, 20, 20)
    }

    fun getDefaultStockObject() = Stock(bestLowestPrice = 5, bestHighestPrice = 20)
}