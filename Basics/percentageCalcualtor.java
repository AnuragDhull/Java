import java.util.Scanner;

public class percentageCalcualtor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in subject 1");
        int a=sc.nextInt();
        System.out.println("Enter your marks in subject 2");
        int b=sc.nextInt();
        System.out.println("Enter your marks in subject 3");
        int c=sc.nextInt();
        System.out.println("Enter your marks in subject 4");
        int d=sc.nextInt();
        System.out.println("Enter your marks in subject 5");
        int e=sc.nextInt();

        int sum=a+b+c+d+e;

        float percentage=(sum/500.00f)*100;

        System.out.println("Your percentage is "+percentage);


        sc.close();
    }
}
