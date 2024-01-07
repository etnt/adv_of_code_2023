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
}
