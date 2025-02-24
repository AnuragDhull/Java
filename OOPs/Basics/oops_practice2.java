package OOPs.Basics;

class Smartphone
{

    public void call()
    {
        System.out.println("Calling...");
    }
    public void ring()
    {
        System.out.println("Ringing...");
    }
    public void vibrate()
    {
        System.out.println("Vibrating...");
    }
}

public class oops_practice2 {
    public static void main(String[] args) {
        
        Smartphone apple=new Smartphone();
        apple.call();
        apple.ring();
        apple.vibrate();
        
    }
}
