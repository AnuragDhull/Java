package OOPs.Abstract;

abstract class parent 
{
    public void a()
    {
        System.out.println("heyy");
    }
    abstract public void greet ();
   
}

class child extends parent
{
    public void greet()
    {
        System.out.println("Good Morning");
    }
}

public class abstarct_basics {
    public static void main(String[] args) {
        // parent p =new parent ();
        // u cant make object of abstract class

        child c = new child();
        c.greet();
        c.a();
             
       
    }
}
