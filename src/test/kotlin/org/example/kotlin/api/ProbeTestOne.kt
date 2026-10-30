package org.example.kotlin.api

import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


@Feature("Calculator Operations")
@Story("Division of two numbers")
class ProbeTestOne {
    @Test
    @DisplayName("test devision of two numbers")
    fun testDivision() {
        val a = 20
        val b = 5
        val expectedResult = 4
        val actualResult = a / b

        expectedResult shouldBe actualResult
    }
}