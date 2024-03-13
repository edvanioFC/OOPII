package avc1;
/**
 * This class represents an And Operator that takes two inputs and returns their logical AND.
 * @author Edvanio Correia
*/
public class AndOperator{
    private int input1;
    private int input2;

    /**
     * Default constructor
    */
    public AndOperator() {}
    
    /**
     * Creates a new AndOperator object with the specified input1 and input2 values.
     *
     * @param input1 the first input value
     * @param input2 the second input value
     * @throws IllegalArgumentException if one of the inputs is negative or greater than 1
    */
    public AndOperator(int input1, int input2) throws IllegalArgumentException {
        if (!checkInput(input1) || !checkInput(input2)) {
            throw new IllegalArgumentException("Input cannot be negative or greater than 1");
        }
        this.input1 = input1;
        this.input2 = input2;
    }

    /**
     * Returns the value of input1.
     *
     * @return the value of input1.
    */
    public int getInput1() {
        return input1;
    }

    /**
     * Sets the value of input1.
     *
     * @param input1 the new value of input1.
     * @throws IllegalArgumentException if input1 is negative or greater than 1.
    */
    public void setInput1(int input1) throws IllegalArgumentException{
        if(!checkInput(input1)){
            throw new IllegalArgumentException("Input1 cannot be negative or greater than 1");
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
     * Sets the value of input2.
     *
     * @param input2 the new value of input2.
     * @throws IllegalArgumentException if input2 is negative or greater than 1.
    */
    public void setInput2(int input2) throws IllegalArgumentException{
        if(!checkInput(input2)){
            throw new IllegalArgumentException("Input2 cannot be negative or greater than 1");
        }
        this.input2 = input2;
    }
    
    /**
     * Checks if the input is within the range of 0 to 1.
     *
     * @param input the input to be checked
     * @return true if the input is within the range, false otherwise
    */
    public boolean checkInput(int input){
        return (input >= 0 && input <= 1); 
    }


    /**
     * Returns a string representation of the objects.
     *
     * @return a string representation of the entries objects.
    */
    public String showEntries() {
        return String.format("Entries {Input1= %d, Input2= %d}", getInput1(), getInput2());
    }

    /**
     * This function performs a multiplication operation on two inputs and returns the result.
     *
     * @param input1 the first input value
     * @param input2 the second input value
     * @return the result of the multiplication operation
    */
    public int operation(int input1, int input2) {
        return input1 * input2;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the result.
     */
    @Override
    public String toString() {
        return "Result= " +  operation(getInput1(), getInput2());
    }
}


