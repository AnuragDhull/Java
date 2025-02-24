package  OOPs.Basics;
class employee{
    int salary;
    String name;

public int getsalary()
{
    return salary;
}
public void setName(String n)
{
    name=n;
}
public String getname()
{
    return name;
}


}
public class oops_practice1 {
    public static void main(String[] args) {
        employee e2=new employee();

        e2.setName("Jaat");
        e2.salary=10000;

        System.out.println(e2.getname());
        System.out.println(e2.salary);
     
    }
}
