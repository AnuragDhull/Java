package Errors ;
import java.util.Scanner;

class MyException extends Exception {
   
    public String toString() {
        return super.toString() +"I am toString()";
    }
    public String getMessage() {
        return super.getMessage() + "I am getMessage()";
    }
}

public class Exception_class1 {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();

        if(a<9)
            {
                try 
                {
                    throw new MyException();
                }
                catch (MyException e) 
                {
                    System.out.println("Caught");
                    System.out.println(e.getMessage());
                    System.out.println(e.toString());
                    e.printStackTrace();

                    System.out.println("finished");
                }
            }
           
        }
    }

