package com.latitude.challenge

import com.latitude.challenge.service.StockPriceCalculator
import org.slf4j.LoggerFactory

private val LOG = LoggerFactory.getLogger("MainFunction")

    fun main(args: Array<String>) {

        val stockPrices = listOf(1, 9, 10, 7, 2, 5, 8, 11, 9)
        val bestStockPrice = StockPriceCalculator.calculateMaxProfitStock(stockPrices)

        LOG.info("=============================================================================")
        LOG.info("Best Stock Price for given input is: ${bestStockPrice.maxPossibleProfit()} (buying for \$${bestStockPrice.bestLowestPrice} and selling for \$${bestStockPrice.bestHighestPrice})")
        LOG.info("=============================================================================")
    }
