import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File
import adv_of_code_2023.Day1

class Day1Test {

    @Test
    fun testSum() {
        val day1 = Day1()

        // Create a temporary file and write some test data to it
        val tempFile = File.createTempFile("test", null)
        tempFile.writeText("a1b2c3\nx9y8z7\n")

        // Call the method that calculates the sum
        val sum = day1.calculateSum(tempFile.absolutePath)

        // Check that the sum is correct
        assertEquals(110, sum)

        // Delete the temporary file
        tempFile.delete()
    }

    @Test
    fun testSumWithNoDigits() {
        val day1 = Day1()

        // Create a temporary file and write some test data to it
        val tempFile = File.createTempFile("test", null)
        tempFile.writeText("abc\nxyz\n")

        // Call the method that calculates the sum
        val sum = day1.calculateSum(tempFile.absolutePath)

        // Check that the sum is 0 because there are no digits in the input data
        assertEquals(0, sum)

        // Delete the temporary file
        tempFile.delete()
    }

    @Test
    fun testSumWithOneDigitPerLine() {
        val day1 = Day1()

        // Create a temporary file and write some test data to it
        val tempFile = File.createTempFile("test", null)
        tempFile.writeText("a1b\nx2y\n")

        // Call the method that calculates the sum
        val sum = day1.calculateSum(tempFile.absolutePath)

        // Check that the sum is 0 because there's only one digit per line in the input data
        assertEquals(33, sum)

        // Delete the temporary file
        tempFile.delete()
    }

    
    @Test
    fun testSumWithSeveralLines() {
        val day1 = Day1()

        val list = listOf("1abc2","pqr3stu8vwx","a1b2c3d4e5f","treb7uchet")
        val joinedList = list.joinToString("\n")

        // Create a temporary file and write some test data to it
        val tempFile = File.createTempFile("test", null)
        tempFile.writeText(joinedList)

        // Call the method that calculates the sum
        val sum = day1.calculateSum(tempFile.absolutePath)

        // Check that the sum is correct
        assertEquals(142, sum)

        // Delete the temporary file
        tempFile.delete()
    }

    @Test
    fun testSumWithLetters() {
        val day1 = Day1()

        val list = listOf("two1nine","eightwothree","abcone2threexyz","xtwone3four",
                          "4nineeightseven2","zoneight234","7pqrstsixteen")
        val joinedList = list.joinToString("\n")

        // Create a temporary file and write some test data to it
        val tempFile = File.createTempFile("test", null)
        tempFile.writeText(joinedList)

        // Call the method that calculates the sum
        val sum = day1.calculateSum3(tempFile.absolutePath)

        // Check that the sum is correct
        assertEquals(281, sum)

        // Delete the temporary file
        tempFile.delete()
    }

    @Test
    fun testSumWithLetters2() {
        val day1 = Day1()

        val list = listOf("eightwothree","abcone2","nine")
        val joinedList = list.joinToString("\n")

        // Create a temporary file and write some test data to it
        val tempFile = File.createTempFile("test", null)
        tempFile.writeText(joinedList)

        // Call the method that calculates the sum
        val sum = day1.calculateSum3(tempFile.absolutePath)

        // Check that the sum is correct
        assertEquals(194, sum)

        // Delete the temporary file
        tempFile.delete()
    }
}
