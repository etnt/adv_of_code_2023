import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File
import adv_of_code_2023.Day2

class Day2Test {

    // Prompt:
    // Write a unit test function that create a temporary file,
    // write a couple of game strings into it, invokes the 
    // processGamesFromFile function and check that the result
    // is what was expected
    @Test
    fun testProcessGamesFromFile() {
        // Arrange
        val predefinedMap = mapOf("blue" to 10, "red" to 10, "green" to 10)
        val gameStrings = listOf(
            "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
            "Game 2: 1 blue, 2 red; 3 red, 4 green, 5 blue; 6 green",
            "Game 3: 7 blue, 8 red; 9 red, 10 green, 11 blue; 12 green"
        )
        val expectedSum = 1 + 2  // Game 1 and Game 2 have all maps less than or equal to the predefined map

        val tempFile = File.createTempFile("test", null)
        tempFile.writeText(gameStrings.joinToString("\n"))
        tempFile.deleteOnExit()

        val day2 = Day2()

        // Act
        val actualSum = day2.processGamesFromFile(tempFile.absolutePath, predefinedMap)

        // Assert
        assertEquals(expectedSum, actualSum)

        // Delete the temporary file
        tempFile.delete()
    }

    @Test
    fun testProcessGamesFromFile2() {
        // Arrange
        val predefinedMap = mapOf("blue" to 14, "red" to 12, "green" to 13)
        val gameStrings = listOf(
            "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
            "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue",
            "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red",
            "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red",
            "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"
        )
        val expectedSum = 8

        val tempFile = File.createTempFile("test", null)
        tempFile.writeText(gameStrings.joinToString("\n"))
        tempFile.deleteOnExit()

        val day2 = Day2()

        // Act
        val actualSum = day2.processGamesFromFile(tempFile.absolutePath, predefinedMap)

        // Assert
        assertEquals(expectedSum, actualSum)

        // Delete the temporary file
        tempFile.delete()
    }
}
