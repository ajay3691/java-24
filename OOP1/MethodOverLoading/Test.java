class Test{
    void m1(){ 
        System.out.println("m1 method - zero arg");
    }
    void m1(int a){ 
         System.out.println("m1 method - 1 arg with int type");
    }
    void m1(int b,int c){
         System.out.println("m1 method - two arg bott int type");
     }
   /*  void m1(float d){ 
        System.out.println("m1 method -float");
    } */
    void m1(double e){ 
        System.out.println("m1 method - double type");
    }
    void m1(String name){ 
        System.out.println("m1 method - String");
    }

    public static void main(String[] args){
    Test t= new Test();
    t.m1();
    t.m1(10);
    t.m1(10,20);
    t.m1(200.00);
    t.m1(null);
    t.m1(20.0f);
    }    
}
