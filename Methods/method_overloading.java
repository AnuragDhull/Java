package Methods;

public class method_overloading {
    
    static void tellJoke()
    {
        System.out.println("motuuuuuu");
    }

    static int sum(int a,int b)
    {
        int c = a+b;
        return c;
    }

    static int sum(int a,int b,int c)
    {
        int d = a+b +c;
        return d;
    }

    public static void main(String[] args) {
        
        tellJoke();
        int x=sum(2, 3);
        int y=sum(1,2,4);
        System.out.println(x);
        System.out.println(y);
    }
}
