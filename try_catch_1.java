 package Errors ;

public class try_catch_1 {
    public static void main(String[] args) {
        
        int a=5;
        int b=0;

        try {
            int c=a/b;
            System.out.println(c);

        }

        catch (Exception e) {
            System.out.println("Error: "+e);
        }

        System.out.println("End of Program !!!");
    }
}
