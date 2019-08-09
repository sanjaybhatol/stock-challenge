package com.latitude.challenge.service

import com.latitude.challenge.Fixture
import com.latitude.challenge.model.Stock
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class StockPriceCalculatorTest {

    @Test
    fun `calculate max profit stock with incremental stock price`() {
        val actualMaxProfitStock = StockPriceCalculator.calculateMaxProfitStock(Fixture.StockPrices.INCREMENTAL_STOCK_PRICES)
        assertStockValues(actualMaxProfitStock, 1, 5, 4)
    }

    @Test
    fun `calculate max profit stock with decreasing stock price`() {
        val actualMaxProfitStock = StockPriceCalculator.calculateMaxProfitStock(Fixture.StockPrices.DECREASING_STOCK_PRICES)
        assertStockValues(actualMaxProfitStock, 2, 2, 0)
    }

    @Test
    fun `calculate max profit stock when stock prices are consistent and not changing`() {
        val actualMaxProfitStock = StockPriceCalculator.calculateMaxProfitStock(Fixture.StockPrices.CONSISTENT_STOCK_PRICES)
        assertStockValues(actualMaxProfitStock, 20, 20, 0)
    }

    @Test
    fun `calculate max profit stock when stock when there are multiple spikes in stock price`() {
        val actualMaxProfitStock = StockPriceCalculator.calculateMaxProfitStock(Fixture.StockPrices.MULTIPLE_SPIKES_IN_STOCK_PRICES)
        assertStockValues(actualMaxProfitStock, 2, 5, 3)
    }

    private fun assertStockValues(actualMaxProfitStock: Stock, expectedLowestPriceValue: Int, expectedHighestPriceValue: Int, expectedProfit: Int) {
        assertThat(actualMaxProfitStock.bestLowestPrice).isEqualTo(expectedLowestPriceValue)
        assertThat(actualMaxProfitStock.bestHighestPrice).isEqualTo(expectedHighestPriceValue)
        assertThat(actualMaxProfitStock.maxPossibleProfit()).isEqualTo(expectedProfit)
    }
}