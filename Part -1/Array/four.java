class Test{
    int a = 10;
    int b = 20;
    static int c=30;
    public static void main(String[] args){
       Test t1=new Test();
       Test t2=new Test();
        System.out.println(t1.a);
        System.out.println(t1.b);
        t2.c = 300;
        System.out.println(t1.c);
        System.out.println(Test.c);
        System.out.println(c);
    }
}