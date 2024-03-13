package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import avc1.AndOperator;
import avc1.AndOperatorWith3;

/**
 * This class contains test methods for the AndOperatorWith3 class.
 * @author Edvanio Correia
 *
 */
public class AndOperatorWith3Test {   

    /**
     * Test method to verify the correctness of the showEntries method.
     */
    @Test
    public void showEntriesTest() {
        AndOperator operator = new AndOperator(1, 1);
        AndOperatorWith3 andOperatorWith3 = new AndOperatorWith3(1, 1, 1, operator);
        String expected = "Entries {Input1= 1, Input2= 1, Input3= 1}";
        String actual = andOperatorWith3.showEntries();
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test method to verify the correctness of the operation method.
     */
    @Test
    public void operationTest() {
        AndOperator operator = new AndOperator(1, 1);
        AndOperatorWith3 andOperatorWith3 = new AndOperatorWith3(1, 1, 1, operator);
        int result = andOperatorWith3.operation();
        Assertions.assertEquals(1, result);
    }
}
