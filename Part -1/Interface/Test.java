interface TestInterface{
    public static final int x = 200;
}
public class Test implements TestInterface{

public static void main(String[] args){
   Test t = new Test();
   //x = 300;
   System.out.println(t.x);
   System.out.println(x);
   System.out.println(Test.x);
}
}