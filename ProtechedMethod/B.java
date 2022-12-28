package pack2;
import pack1.A;
public class B extends A{

    public static void main(String[] args){
        //A a1=new A();
        //a1.m1();
        B b1=new B();
        b1.m1();
        A b2 = new B();
        b2.m1();
    }
}
