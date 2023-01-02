class Employee{
    private int eId;
    private String eName;
    public void seteId(int id){
        this.eId = id;
    }
    public int geteId(){
        return eId;
    }
    public void seteName(String name){
        this.eName = name;
    }
    public String geteName(){
        return eName;
    }
}
public class Test{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.seteId(101);
        e1.seteName("Rahul Gandhi");
        System.out.println(e1.geteId());
        System.out.println(e1.geteName());
        
        Employee e2=new Employee();
        e2.seteId(102);
        e2.seteName("Sonia");
        System.out.println(e2.geteId());
        System.out.println(e2.geteName());
    
    }
}