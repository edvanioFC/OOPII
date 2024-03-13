package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import avc1.AndOperator;

/**
 * This class contains test methods for the AndOperator class.
 *  @author Edvanio Correia
 */
public class AndOperatorTest {

    /**
     * Tests the validity of an input for the AndOperator class.
     */
    @Test
    public void validInputTest() {
        // Arrange
        AndOperator operator = new AndOperator(0, 1);

        // Act
        boolean result = operator.checkInput(0);

        // Assert
        Assertions.assertTrue(result);
    }

    /**
     * Tests the invalidity of an input for the AndOperator class.
     */
    @Test
    public void invalidInputTest() {
        // Arrange
        AndOperator operator = new AndOperator(0, 1);

        // Act
        boolean result = operator.checkInput(2);

        // Assert
        Assertions.assertFalse(result);
    }

    /**
     * Tests the showEntries method of the AndOperator class.
     */
    @Test
    public void showEntriesTest() {
        // Arrange
        AndOperator andOperator = new AndOperator(1, 1);
        String pattern = "Entries {Input1= 1, Input2= 1}";

        // Act
        String actual = andOperator.showEntries();

        // Assert
        assertEquals(pattern, actual);
    }

    /**
     * Tests the operation method of the AndOperator class.
     */
    @Test
    public void operationTest() {
        // Arrange
        AndOperator andOperator = new AndOperator(1, 1);

        // Act
        int result = andOperator.operation(1, 1);

        // Assert
        assertEquals(1, result);
    }
}
