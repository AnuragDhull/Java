package OOPs.Threads;

class Thread1 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("Thread 1 is running");
            System.out.println("i am sad");
        }
    }
}
class Thread2 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("Thread 2 is running");
            System.out.println("i am happy");
        }
    }
}

public class thread_2 {
    public static void main(String[] args) {
        Thread1 bullet1 = new Thread1();
        Thread gun1=new Thread(bullet1);
        gun1.start();

        Thread bullet2 = new Thread(new Thread2());
        Thread gun2=new Thread(bullet2);
        gun2.start(); 


      
   

    }
}
