import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter math marks :--");
        int math=sc.nextInt();
        System.out.println("enter science marks :--");
        int science=sc.nextInt();
        System.out.println("enter english marks :--");
        int english=sc.nextInt();

        float total=(math+science+english);
        float percentage=(total/300.00f)*100;

        if(percentage >=40 && math >=33 && science >=33 && english >=33)
        {
            System.out.println("You are passed with "+percentage+"%");
        }
        else
        {
            System.out.println("You are failed with "+percentage+"%");
        }

        sc.close();
    }
}
