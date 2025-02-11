package com.ondevs.horoscapp.ui.providers

import io.kotlintest.shouldNotBe
import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest{

    @Test
    fun `getRandomCard should return a random card`(){
        val randomCard = RandomCardProvider()

        val card = randomCard.getLucky()

        assertNotNull(card)

    }

}