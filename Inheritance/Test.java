class Parent{
   public void m1(){
       System.out.println("Parent Class - m1() method");
    }
  public void m2(){
    System.out.println("Parent Class - m2() method");
    }
}
class Child extends Parent{
public void m3(){
    System.out.println("Child Class - m3() method");
    }
}
public class Test{
    public static void main(String[] args){
       /*  Parent p1=new Parent();
        p1.m1();
        p1.m2();
        p1.m3(); */
        //Child  p1=new Parent();
       /*  Parent c1=new Child();
        c1.m1();
        c1.m2();
        //c1.m3(); //m3 method not avail */
        Child c2=new Child();
        c2.m1();
        c2.m2();
        c2.m3();
    }
}