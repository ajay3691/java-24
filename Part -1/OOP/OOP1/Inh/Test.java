class Parent{
    public void m1(){
        System.out.println("Parent Calss - m1 method");
    }
    public void m2(){
        System.out.println("Parent Calss - m2 method");
    }
}
class Child extends Parent{
  public void m3(){
        System.out.println("Child Calss - m3 method");
    }
}
class Test{
    public static void main(String[] args){
    Child c1 = new Child();//m1,m2,m3
    c1.m1();
    c1.m2();
    c1.m3();
    System.out.println("*******");
    //Child p1 = new Parent(); //CE
    Parent p2 =new Parent();//m1,m2
    p2.m1();
    p2.m2();
    System.out.println("*******");
    Parent c2=new Child();//m1,m2
    c2.m1();
    c2.m2();

    }
}