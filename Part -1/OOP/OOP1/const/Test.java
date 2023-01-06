class Emp{
    int eId;
    String eName;
    Emp(int id, String name){
        this.eId = id;
        this.eName=name;
        System.out.println("Const executing Auto");
    }
}

public class Test{
    public static void main(String[] args){
        Emp e1 = new Emp(101,"Rahul");
        Emp e2= new Emp(102,"Sonia");
        Emp e3 =new Emp(103,"Priyanka");
        System.out.println(e1.eId + ":"+e1.eName);
        System.out.println(e2.eId + ":"+e2.eName);
        System.out.println(e3.eId + ":"+e3.eName);

    }
}