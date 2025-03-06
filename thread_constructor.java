package OOPs.Threads;

class Thread1 extends Thread
{   
    public Thread1(String name)     // constructor of a thread // 
    {                   
        super(name);
    }
    public void run()
    {   while(true)  {
        System.out.println("Thread 1 is running");
        System.out.println("i am sad");
    }
    }
   
}
public class thread_constructor {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1("Thread 1");
        t1.start();

        // System.out.println(t1.getId());   to get the id of the thread
        // System.out.println(t1.getName()); to get the name of the thread
        
    }
}
