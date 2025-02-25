package OOPs.Constructors;


class Base{
    Base ()
    {
    System.out.println("I am a constructor of base class ");
    }
}

class Derived extends Base{
    Derived()
    {
    System.out.println("I am constructor of derived class ");
    }
}

public class constructors_inheritence {
    public static void main(String[] args) {
        Base b =new Base();

        Derived d=new Derived();

        
    }
}
