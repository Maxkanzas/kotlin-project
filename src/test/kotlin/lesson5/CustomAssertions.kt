package lesson5

import lesson4.User

fun String.isPhoneNumber(): Boolean {
    val regex = Regex("""\+\d{11}""")
    return regex.matches(this)
}

infix fun String.shouldBePhoneNumber(expected: Boolean) {
    val actual = this.isPhoneNumber()

    assertCondition(actual == expected) {
        "Expected: $expected, actual: $actual. Value: $this"
    }
}

inline fun assertCondition(condition: Boolean, message: () -> String) {
    if (!condition) {
        throw AssertionError(message())
    }
}

infix fun String.shouldBeUpperCase(expected: Boolean) {
    val actual = this == this.uppercase()

    assertCondition(actual == expected) {
        "Expected: $expected, actual: $actual. Value: $this"
    }
}

infix fun User.shouldHaveName(expectedName: String) {
    assertCondition(!this.name.isNullOrBlank()) {
        "User name must not be empty"
    }
    assertCondition(this.name == expectedName) {
        "Expected name: $expectedName, actual: ${this.name}"
    }
}

fun main() {
    val user = User("Maxim", "Samsonov", 35)
    user shouldHaveName "Maxim"
    println("User name is correct")

    "+79991234567" shouldBePhoneNumber true
    "Hello" shouldBePhoneNumber false

    "HELLO" shouldBeUpperCase true
    "Hello" shouldBeUpperCase false
}