package com.latitude.challenge.service

import com.latitude.challenge.model.Stock

object StockPriceCalculator {

    fun calculateMaxProfitStock(stockPrices: List<Int>) = getBestProfitStock(stockPrices)

    private fun getBestProfitStock(stockPrices: List<Int>): Stock {

        //Initially the lowestPriceIndex and highestPriceIndex will be the same.
        var bestStockTradingDeal = Stock(0, 0)

        stockPrices.fold(Stock(stockPrices[0], 0)) { tempBestTradingDeal, stockPriceInTime ->

            if (tempBestTradingDeal.isLessThanBestLowestPrice(stockPriceInTime)) {
                tempBestTradingDeal.apply { bestLowestPrice = stockPriceInTime; bestHighestPrice = stockPriceInTime }
            }
            if (tempBestTradingDeal.isGreaterThanBestHighestPrice(stockPriceInTime)) {
                tempBestTradingDeal.apply { bestHighestPrice = stockPriceInTime }
            }
            if (tempBestTradingDeal.isGreaterThanStockProfit(bestStockTradingDeal)) {
                bestStockTradingDeal = tempBestTradingDeal.copy()
            }
            tempBestTradingDeal
        }
        return bestStockTradingDeal
    }

}