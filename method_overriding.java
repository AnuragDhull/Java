package OOPs.Constructors;

class A {

    public void meth1()
    {
        System.out.println("method 1 of class A");
    }
}

class B extends  A {
    public void meth2()
    {
        System.out.println("method 2 of class B");
    }
    public void meth1()
    {
        System.out.println("method 1 of class B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        A a =new A();
        a.meth1();

        B b =new B();
        b.meth1();
        b.meth2();
    }
} 
