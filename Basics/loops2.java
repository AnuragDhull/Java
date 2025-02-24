import java.util.Scanner;
public class loops2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int n=sc.nextInt();

        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum=sum+ 2*i;
        }
        System.out.println(sum);
        sc.close();
        
    }
}
