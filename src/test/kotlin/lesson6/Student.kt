package lesson6

data class Student(
    val name: String,
    val lastName: String,
    val age: Int,
    val course: Int
)

val defaultStudent = Student(
    name = "Maxim",
    lastName = "Ivanov",
    age = 35,
    course = 2
)