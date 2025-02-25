package OOPs.Inheritence;

class Circle    {
    public int r;
    public Circle(int r)
    {
        this.r=r;
    }
    public double area()
    {
        return Math.PI*r*r;
    }
}

class Cylinder extends Circle {
    public int h;
    public Cylinder(int r,int h)
    {
        super(r);
        this.h=h;
    }
    public double volume()
    {
        return Math.PI*r*r*h;
    }
}

public class inheritence_practise {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(5,4 );
        System.out.println(c.area());
    }
}
