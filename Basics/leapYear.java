import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");

        int year=sc.nextInt();

        if(year %4==0 && year %100!=0 && year%400==0)
        {
            System.out.println("its leap year");
        }
        else
        {
            System.out.println("its not a leap year");
        }
        sc.close();
    }
}
