package org.example.kotlin.api

import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


@Feature("String Operations")
@Story("Concatenation strings")
class ProbeTestThird {
    @Test
    @DisplayName("Concatenation of two strings")
    fun testConcatenation() {
        val firstName = "Maxim"
        val lastName = "Ivanov"
        val expectedResult = "Maxim Ivanov"
        val actualResult = "$firstName $lastName"

        expectedResult shouldBe actualResult
    }
}