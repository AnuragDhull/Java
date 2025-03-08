package Errors;

public class throw_1 {
    public static int divide(int a,int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("Divide by zero error");
        }
        else
        { 
            return a/b;
        }
    }

    public static void main(String[] args) {
            int c;
            // c=divide(5, 0);
            // System.out.println(c);   as above mentioned in the snippet, this will throw an exception
            // hence, we will use try-catch block to handle the exception
            try {
                c=divide(5, 0);
                System.out.println(c);
            }
            catch (Exception e) {
                System.out.println("Error: "+e);
            }
            System.out.println("End of Program !!!"); 
    }
}
