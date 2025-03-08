package Errors;

import java.util.Scanner;

public class finally_2 {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            
            scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt(); // Read user input
            System.out.println("You entered: " + num);
        } 
        catch (Exception e) {
            System.out.println("Invalid input!");
        } 
        finally {
            if (scanner != null) {
                scanner.close(); // Ensuring scanner is closed
                System.out.println("Scanner closed.");
            }
        }
    }
}

