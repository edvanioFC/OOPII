package avc1;
/**
 * This class represents an implementation of the And Operator with 3 inputs.
 * It takes two inputs and applies the And Operator between them using another andOperator class.
 * The result is then multiplied by a third input.
 * @author Edvanio Correia
*/
public class AndOperatorWith3{
    private int input1;
    private int input2;
    private int input3;
    private AndOperator operator;

    /**
     * Default constructor
    */
    public AndOperatorWith3(){
    }

    /**
     * Constructor that takes three inputs to be used in the operator
     *
     * @param input1 the first input
     * @param input2 the second input
     * @param input3 the third input
     * @param operator the And Operator to be applied
     * @throws IllegalArgumentException if any of the inputs are negative or greater than 1
    */
    public AndOperatorWith3(int input1, int input2, int input3, AndOperator operator) throws IllegalArgumentException{
        if (!operator.checkInput(1) ||  !operator.checkInput(input2) || !operator.checkInput(input3)){
            throw new IllegalArgumentException("Input cannot be negative or greater than 1");
        }
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.operator = operator;
    }

    /**
     * Returns the first input.
     *
     * @return the first input
    */
    public int getInput1() {
        return input1;
    }

    /**
     * Sets the first input.
     *
     * @param input1 the new value of input1.
     * @throws IllegalArgumentException if the input is negative or greater than 1
    */
    public void setInput1(int input1) throws IllegalArgumentException{
        if (!operator.checkInput(input1)) {
            throw new IllegalArgumentException("Input cannot be negative or greater than 1");
        }
        this.input1 = input1;
    }

    /**
     * Returns the second input.
     *
     * @return the second input
    */
    public int getInput2() {
        return input2;
    }

    /**
     * Sets the second input.
     *
     * @param input2 the new value of input2.
     * @throws IllegalArgumentException if the input is negative or greater than 1
     */
    public void setInput2(int input2) throws IllegalArgumentException{
        if (!operator.checkInput(input2)) {
            throw new IllegalArgumentException("Input cannot be negative or greater than 1");
        }
        this.input2 = input2;
    }

    /**
     * Returns the third input.
     *
     * @return the third input
    */
    public int getInput3() {
        return input3;
    }

    /**
     * Sets the third input.
     *
     * @param input3 the new value of input3.
     * @throws IllegalArgumentException if the input is negative or greater than 1
     */
    public void setInput3(int input3) throws IllegalArgumentException{
        if (!operator.checkInput(input3)) {
            throw new IllegalArgumentException("Input cannot be negative or greater than 1");
        }
        this.input3 = input3;
    }     

    /**
     * Returns the result of the operation between the two inputs multiplied by the third input.
     * @return the result of the operation between the two inputs using the prevoius class's <strong>operation</strong> method multiplied by the third input
    */
    public int operation() {
        return (operator.operation(getInput1(), getInput2()) * getInput3());
    }

    /**
     * Returns a string representation of the objects.
     *
     * @return a string representation of the entries objects.
    */
    public String showEntries() {
        return String.format("Entries {Input1= %d, Input2= %d, Input3= %d}",
         getInput1(), getInput2(), getInput3()
        );
    }

    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the result.
    */
    public String toString() {
        return "Result= " +  operation();
    }
}