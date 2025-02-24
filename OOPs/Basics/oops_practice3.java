package  OOPs.Basics;

import java.util.Scanner;

class rectangle{
    int lenght;
    int breadth;

public int area ()
{
    return lenght*breadth;
}
public int perimeter()
{
    return 2*(lenght+breadth);
}
}

public class oops_practice3 {
    public static void main(String[] args) {
        rectangle r1=new rectangle();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of rectangle: ");
        r1.lenght=sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        r1.breadth=sc.nextInt();


       System.out.println(r1.area());
       System.out.println(r1.perimeter());


       sc.close();
    }
}
