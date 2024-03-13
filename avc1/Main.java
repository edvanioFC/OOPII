package avc1;
/**
 * This class contains the main method, which creates two arrays of AndOperator objects, 
 * and then iterates through each array, printing out the results of each AndOperator object.
 * @author Edvanio Correia
 */

public class Main {

    /**
     * The main method creates two arrays of AndOperator objects, and then iterates through each array, 
     * printing out the results of each AndOperator object.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        /**
         * The first array, operations, for four AndOperator objects, each with two entries.
         */
        AndOperator operations[] = new AndOperator[4];

        /**
         * The second array, operationsWith3, for four AndOperatorWith3 objects, each with three entries.
         */
        AndOperatorWith3 operationsWith3[] = new AndOperatorWith3[4];

        /**
         * The AndOperator object, operator, is used to create the entries for both arrays.
         */
        AndOperator operator = new AndOperator();

        /**
         * Four AndOperatorWith3 objects in the operationsWith3 array are created, 
         * each with three entries and the same AndOperator object as the first entry.
         */
        operationsWith3[0] = new AndOperatorWith3(1, 1, 1, operator);
        operationsWith3[1] = new AndOperatorWith3(1, 1, 0, operator);
        operationsWith3[2] = new AndOperatorWith3(1, 0, 0, operator);
        operationsWith3[3] = new AndOperatorWith3(0, 0, 0, operator);

        /**
         * Four AndOperator objects in the operations array are created, 
         * each with two entries and no AndOperator object.
         */
        operations[0] = new AndOperator(0, 0);
        operations[1] = new AndOperator(0, 1);
        operations[2] = new AndOperator(1, 0);
        operations[3] = new AndOperator(1, 1);

        /**
 * Performs operations using AndOperator objects with different numbers of inputs and displays the results.
 * Operations are performed with AndOperator objects with two inputs and AndOperatorWith3 objects with three inputs.
 * The results of the operations are displayed in the console.
 */
try {
    // Performs operations with AndOperator objects with two inputs
    System.out.println();
    System.out.println("Using 2 entries");
    for (int i = 0; i < operations.length; i++) {
        System.out.println("--------------------------------");
        System.out.println("Test " + (i + 1));
        // Displays the entries of the current object
        System.out.println(operations[i].showEntries());
        // Displays the result of the operation of the current object
        System.out.println(operations[i].toString());
    }

    System.out.println();
    System.out.println();

    // Performs operations with AndOperatorWith3 objects with three inputs
    System.out.println("Using 3 entries");
    for (int i = 0; i < operationsWith3.length; i++) {
        System.out.println("--------------------------------");
        System.out.println("Test " + (i + 1));
        // Displays the entries of the current object
        System.out.println(operationsWith3[i].showEntries());
        // Displays the result of the operation of the current object
        System.out.println(operationsWith3[i].toString());
    }
} catch (Exception e) {
    // If an exception occurs, print it
    e.printStackTrace();
}
    }
}
