package OOPs.Constructors;



class Ekclass{
    int a;

    public int getA()
    {
        return a;
    }
    Ekclass(int v)
    {
        this.a=v;
    }
}

class Doclass extends Ekclass{
    Doclass(int c)
    {
        super(c);
        System.out.println("i am a constructor of derived class");
    }
}
public class this_super {
    public static void main(String[] args) {
        Ekclass e=new Ekclass(5);
        System.out.println(e.getA());

        Doclass d=new Doclass(6);
        System.out.println(d.getA());
    }
}
