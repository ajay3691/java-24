public class Employee{
    int eId;
    String eName;

    Employee(int id, String name){
        this.eId=id;
        this.eName=name;
    }
    public String toString(){
        return "Employee Name:"+this.eName+"-"+"Emp Id:"+this.eId;
    }
    public static void main(String[] args){
        Employee e1=new Employee(101,"Rahul");
        System.out.println(e1);
        System.out.println(e1.toString());
    }
}