package org.example.kotlin.api

import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Tag

@Feature("Calculator Operations")
@Story("Multiplication of two numbers")
@Tags(Tag("calculator"), Tag("multiplication"))
class ProbeTestTwo {
    @Test
    @DisplayName("test Multiplication of two numbers")
    fun testMultiplication() {
        val a = 5
        val b = 5
        val expectedResult = 25
        val actualResult = a * b

        expectedResult shouldBe actualResult
    }
}