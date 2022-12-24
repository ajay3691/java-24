class Test{
    int a = 10;
    int b = 20;
    static int c=30;
    public static void main(String[] args){
       Test t1=new Test();
       Test t2=new Test();
       t2.b = 200;
       System.out.println(t1.a + t1.b+t1.c);
       System.out.println(t2.a + t2.b+t2.c);
    }
}