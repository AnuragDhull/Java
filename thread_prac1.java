package OOPs.Threads;

class Thread1 extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("goodmorning !!");
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Welcome !!!");
        }
    }
}

public class thread_prac1 {
    public static void main(String[] args) {
        Thread1 t1 =new Thread1();
        Thread2 t2 =new Thread2();
        
        t1.start();
        t2.start();


    }
}
