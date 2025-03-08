package Errors;

public class finally_1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 2; // Change to 10 / 0 to see exception case
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            
            System.out.println("This block always executes!");
        }
    }
}
