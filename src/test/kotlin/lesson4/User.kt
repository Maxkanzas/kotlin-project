package lesson4

import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

data class User (
    val name : String?,
    val lastName : String?,
    val age : Int?
)

fun fillDefaults(user: User): User {
    val name = user.name?: run{
        println("name is null. Default value: Unknown")
        "Unknown"
    }

    val lastName = user.lastName?: run {
        println("lastName is null. Default value: Unknown")
        "Unknown"
    }

    val age = user.age?: run{
        println("age is null. Default value: 0")
        0
    }
    return User(name, lastName, age)
}

fun main() {
    val user = User(null, null, null)
    val updatedUser = fillDefaults(user)

    updatedUser.name shouldBe "Unknown"
    updatedUser.lastName shouldBe "Unknown"
    updatedUser.age shouldBe 0

    // 1. Создаём пользователя
    val anotherUser = User("Maxim", "Samsonov", null)
    // 2. Передаём пользователя в функцию
    val newUser = fillDefaults(anotherUser)
    // 3. Выводим в консоль
    println(newUser)
}

