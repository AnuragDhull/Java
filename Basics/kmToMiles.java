import java.util.Scanner;

public class kmToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in km");
        float km=sc.nextFloat();
        float miles=km*0.621371f;
        System.out.println("The distance in miles is "+miles);
       

        // Question 2 
        System.out.println("enter a number ");
        int a =sc.nextInt();
        System.out.println(sc.hasNextInt());
        System.out.println(a);
        sc.close();
    }
}
