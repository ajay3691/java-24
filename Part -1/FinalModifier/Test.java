class Parent{
    public final  void m1(){
        System.out.println("Parent class m1() method");
    }
}
class Child extends Parent{
  public   void m1(){
        System.out.println("Child class m1() method");
    }
}
public class Test{
    public static void main(String[] args){
        Child c1=new Child();
        c1.m1();
    }
} 