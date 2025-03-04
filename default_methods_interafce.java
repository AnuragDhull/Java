package OOPs.Interfaces;

interface Mycamera
{
    void takesnap ();
    void recordvideo();

    private void greet ()   // u cant acess this from mysmartphone class
                            // u have to use it in same interface
    {
        System.out.println("Good Morning");
    }

    default void record4kvideo ()   // u can add body in inerface after using
                                    // default methods 
    {
        greet();
        System.out.println("ultra  pro max quality  !!!");
    }
}
interface Mywifi
{
    void connectToWifi();
    void browse();
}

class Mycellphone 
{
    void call()
    {
        System.out.println("calling...");
    }
}

class Mysmartphone extends Mycellphone implements Mycamera, Mywifi
{
    public void takesnap()
    {
        System.out.println("Taking snap");
    }
    public void recordvideo()
    {
        System.out.println("Recording video");
    }
    public void connectToWifi()
    {
        System.out.println("Connecting to wifi");
    }
    public void browse()
    {
        System.out.println("Browsing");
    }
}


public class default_methods_interafce {
    public static void main(String[] args) {
        Mysmartphone apple =new Mysmartphone();

        apple.call();
        apple.takesnap();
        apple.recordvideo();
        apple.connectToWifi();
        apple.browse();
        apple.record4kvideo();

    }
}
