package com.latitude.challenge.stock

import com.latitude.challenge.Fixture
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class StockTest {

    @Test
    fun `confirm that true is returned when passed price value is greater than the best lowest price`() {
        val actual = Fixture.getDefaultStockObject().isLessThanBestLowestPrice(1)
        assertThat(actual).isEqualTo(true)
    }

    @Test
    fun `confirm that true is returned when passed stock price value is greater than the best highest price`() {
        val actual = Fixture.getDefaultStockObject().isGreaterThanBestHighestPrice(100)
        assertThat(actual).isEqualTo(true)
    }

    @Test
    fun `confirm that true is returned when max stock price value is greater than the best highest price`() {
        val actual = Fixture.getDefaultStockObject().isGreaterThanBestHighestPrice(100)
        assertThat(actual).isEqualTo(true)
    }
}