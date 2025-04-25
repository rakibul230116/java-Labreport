package Labreport.practise;

class A extends Thread{
  public void run(){
    for (int i=1;i<6;i++)
    {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Rakibul");
    }
  }
}
class B extends Thread{
  public void run(){
    for (int i=1;i<6;i++)
    {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hassan");
    }
  }
}

public class thread extends RuntimeException {
  public static void main(String []args)
  {
    A obj=new A();
    B obj1=new B();
    obj.start();
    obj1.start();
  }
    public thread(String message) {
        super(message);
    }
}
