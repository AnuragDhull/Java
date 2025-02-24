package Methods;

public class methods_1 {

    // u can use method without object creation by using static 

    static int sum(int a,int b)
    {
        int c = a+b;
        return c;
    }

    int diff (int x ,int y)
    {
        int z= x-y;
        return z;
    }
    public static void main(String[] args) {
        
        int a=5;
        int b=10;

        int c= sum(a, b);
        System.out.println(c);

        methods_1 obj =new methods_1();
        int d=obj.diff(10, 5);
        System.out.println(d);
    } 
}
