package Errors;

import java.util.Scanner;

public class error_prac_2 {
    public static void main(String[] args) {
        
        int [] marks = {10, 20, 30, 40};
        int index;
        boolean flag=true;

        Scanner sc = new Scanner(System.in);
       

        while (flag == true) {
            try {
                System.out.println("Enter the index of the array");
            index=sc.nextInt();
            System.out.println("value of  is: "+ marks[index]);
            flag=false;
            }
            catch (Exception e)
            {
                
                System.out.println("invalid index");
            }
        }
        {
            try {
                System.out.println("Enter the index of the array");
            index=sc.nextInt();
            System.out.println("value of  is: "+ marks[index]);
            break;
            }
            catch (Exception e)
            {
                
                System.out.println("invalid index");
                i++;
            }
        }





    }
}
