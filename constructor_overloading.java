package OOPs.Constructors;

class employee  
{
    int id;
    String name;

    public employee()
    {
        id=45;
        name="jaat";
    }

    public employee(int i, String n)
    {
        id=i;
        name=n;
    }

    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
}
public class constructor_overloading {
    public static void main(String[] args) {
        employee e1 = new employee();
        employee e2 = new employee(12, "Rahul");
        
        System.out.println(e1.getId());
        System.out.println(e1.getName());

        System.err.println(e2.getId()); 
        System.out.println(e2.getName());

    }
}
