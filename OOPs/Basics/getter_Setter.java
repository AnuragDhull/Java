package OOPs.Basics;

class employee {
    int id;
    String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
public class getter_Setter {
    public static void main(String[] args) {
        employee emp1 = new employee();
        emp1.setName("Anurag");
        emp1.setId(1);

        System.out.println(emp1.getName());
        System.out.println(emp1.getId());
    }
}
