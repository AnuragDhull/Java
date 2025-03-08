 package Errors;

public class error_prac_1 {
    public static void main(String[] args) {
        
        try {
            int a=55/23;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("haha");
        }
        catch (ArithmeticException e) {
            System.out.println("hehehehe");

            
        }
    }
    
}