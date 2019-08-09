package com.latitude.challenge.model

data class Stock(var bestLowestPrice: Int,
                 var bestHighestPrice: Int) {

    fun maxPossibleProfit() = bestHighestPrice - bestLowestPrice

    fun isLessThanBestLowestPrice(stockPriceInTime: Int) = stockPriceInTime < bestLowestPrice

    fun isGreaterThanBestHighestPrice(stockPriceInTime: Int) = stockPriceInTime > bestHighestPrice

    fun isGreaterThanStockProfit(stock: Stock) = maxPossibleProfit() >= stock.maxPossibleProfit()
}