package lesson3

import io.kotest.matchers.collections.shouldBeEmpty
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ArrayTests {
    @Test
    @DisplayName("Array is empty")
    fun testEmptyArray() {
        val numbers = emptyArray<Int>()
        numbers.shouldBeEmpty()
    }

    @Test
    @DisplayName("Array is not empty")
    fun testNotEmptyArray() {
        val numbers = arrayOf(10, 20, 30)
        numbers.shouldNotBeEmpty()
    }

    @Test
    @DisplayName("First array element is 10")
    fun testFirstElement() {
        val numbers = arrayOf(10, 20, 30)
        numbers.first() shouldBe 10
    }
}