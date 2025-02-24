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
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
}

public class basics {
    public static void main(String[] args) {
        employee e1 = new employee();

        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
