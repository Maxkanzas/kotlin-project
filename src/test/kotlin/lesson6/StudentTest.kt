package lesson6

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    @DisplayName("Compare students")
    fun testStudentMatchesDefault() {
        val student = Student(
            name = "Maxim",
            lastName = "Ivanov",
            age = 35,
            course = 2
        )
        student shouldBe defaultStudent
    }

    @Test
    @DisplayName("Create student from enum")
    fun testStudentFromEnum() {
        val student = Students.ANNA.toStudent()
        val expectedStudent = Student("Anna", "Petrova", 22, 4)
        student shouldBe expectedStudent
    }
}

