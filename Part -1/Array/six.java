class Test{

    static String org_Name="TCS";
    int esal  = 45000;

    public static void main(String[] args){
       Test t1=new Test();
       Test t2=new Test();
       
       t2.esal = 55000;
       
       System.out.println(org_Name);
       System.out.println(Test.org_Name);
       System.out.println(t1.org_Name);
       System.out.println(t2.org_Name);

       t2.org_Name = "Tata ELXI";
       
       System.out.println(t1.org_Name);
       System.out.println(t2.org_Name);
     
    }
}