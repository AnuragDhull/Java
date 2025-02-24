package  OOPs.Basics;

class employee {
    int id;
    String name;

    
}
public class oops_basics 
{
    public static void main(String[] args)
    {
        employee emp1=new employee();
        emp1.name="Anurag";                 //setting atributes
        emp1.id=1;

        System.out.println(emp1.name);
        System.out.println(emp1.id);
    }
}