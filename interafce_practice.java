package OOPs.Interfaces;

class Monkey
{
    public void jump()
    {
        System.out.println("jumpinggggg !!!");
    }
    public void bite ()
    {
        System.out.println("Bitinggggg !!!");
    }
}

interface BasicAnimal
{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal
{
    public void eat()
    {
        System.out.println("Eatinggggg !!!");
    }
    public void sleep()
    {
        System.out.println("Sleepinggggg !!!");
    }
}

public class interafce_practice {
    public static void main(String[] args) {
        Human anurag=new Human();
        anurag.eat();
        anurag.bite();
    }
}
