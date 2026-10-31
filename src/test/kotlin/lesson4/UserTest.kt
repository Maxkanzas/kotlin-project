package lesson4

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class UserTest {
    @Test
    @DisplayName("Fill empty fields")
    fun testNullFields() {
        val user = User(null, null, null)
        val updatedUser = fillDefaults(user)

        updatedUser.name shouldBe "Unknown"
        updatedUser.lastName shouldBe "Unknown"
        updatedUser.age shouldBe 0
    }
    @Test
    @DisplayName("Keep user data")
    fun testKeepUserData() {
        val user = User("Maxim", "Samsonov", 35)
        val updatedUser = fillDefaults(user)

        updatedUser.name shouldBe "Maxim"
        updatedUser.lastName shouldBe "Samsonov"
        updatedUser.age shouldBe 35
    }
}