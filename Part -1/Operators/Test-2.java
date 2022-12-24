class Test{
    static int a ;
    int b;

    public static void main(String[] args){
    int c=10;
    Test t =new Test();
    System.out.println(a);     // 0
    System.out.println(t.b);   //0
    System.out.println(c);     //CE
    
    }
}