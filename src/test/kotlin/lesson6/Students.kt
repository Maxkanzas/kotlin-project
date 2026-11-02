package lesson6

enum class Students(
    val studentName: String,
    val lastName: String,
    val age: Int,
    val course: Int
)
{
    MAXIM("Maxim", "Ivanov", 35, 2),
    ANNA("Anna", "Petrova", 22, 4);

    fun toStudent() = Student(studentName, lastName, age, course)
}