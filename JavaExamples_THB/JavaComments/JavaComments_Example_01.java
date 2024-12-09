/**
 * This is an example program to demonstrate comments and Javadoc.
 * 
 * @author Yos
 * @version 1.0
 */
public class JavaComments_Example_01 {

    // This is a single-line comment

    /*
     * This is a multi-line comment.
     * It spans multiple lines.
     */

    /**
     * This method adds two numbers.
     * 
     * @param a The first number
     * @param b The second number
     * @return The sum of a and b
     * @see #multiply(int, int)
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * This method multiplies two numbers.
     * 
     * @param a The first number
     * @param b The second number
     * @return The product of a and b
     * @see #add(int, int)
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * The main method to run the program.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        JavaComments_Example_01 example = new JavaComments_Example_01();

        // Adding two numbers
        int sum = example.add(5, 10);
        System.out.println("Sum: " + sum);

        // Multiplying two numbers
        int product = example.multiply(5, 10);
        System.out.println("Product: " + product);
    }
}
