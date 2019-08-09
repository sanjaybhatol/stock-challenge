package com.latitude.challenge

import com.latitude.challenge.service.StockPriceCalculator
import org.slf4j.LoggerFactory
import java.lang.NumberFormatException

private val LOG = LoggerFactory.getLogger("MainFunction")

fun main(args: Array<String>) {

    LOG.info("Please enter comma separated stock prices: ")

    val stockPrices = try {
        readLine()?.let { line -> line.split(",").map { it.trim().toInt() } } ?: emptyList()

    } catch (ex: NumberFormatException) {

        LOG.info("=============================================================================")
        LOG.error("Invalid input.Only integer values are accepted.")
        LOG.info("=============================================================================")
        return
    }

    //val stockPrices = listOf(1, 9, 10, 7, 2, 5, 8, 11, 9)
    val bestStockPrice = StockPriceCalculator.calculateMaxProfitStock(stockPrices)

    LOG.info("=============================================================================")
    LOG.info("Best Stock Price for given input is: ${bestStockPrice.maxPossibleProfit()} (buying for \$${bestStockPrice.bestLowestPrice} and selling for \$${bestStockPrice.bestHighestPrice})")
    LOG.info("=============================================================================")
}
