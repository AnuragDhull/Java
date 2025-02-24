import java.util.Scanner;

public class arrays_checkElement {
    public static void main(String[] args) {
        
        int [] arr ={1,2,3,4,5};
        boolean b=false;


        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number to search:--");
        int n=sc.nextInt();
    
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                b=true;
            }
            
        }
        System.out.println(b);

        sc.close();

        
    }
}
