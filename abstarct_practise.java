package OOPs.Abstract;

abstract class Pen {
    abstract public void write ();
    abstract public void refill ();

}

class FountainPen extends Pen
{
   public void write ()
   {
    System.out.println("writinggggg....");
   }
   public void refill ()
   {
    System.out.println("refillingg....");
   }
   public void changeNib()
   {
    System.out.println("changing nib....");
   }
}
public class abstarct_practise {
    public static void main(String[] args) {
        FountainPen fp=new FountainPen();   
        fp.write();
        fp.refill();
        fp.changeNib();
        
    }
}
