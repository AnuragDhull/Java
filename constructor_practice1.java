package OOPs.Constructors;

class Cylinder {

    int radius  ;
    int height ;

    public Cylinder(int r,int h)
    {
        this.radius=r;
        this.height=h;
    }
    

 int surfaceArea()
{
    return 2*3*radius*height + 2*3*radius*radius;
}
 int volume()
{
    return 3*radius*radius*height;
}
}

public class constructor_practice1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(2,2);

        System.out.println(c1.surfaceArea());
        System.out.println(c1.volume());
    }
} 
