interface TestDao{
public abstract void insertRecords();
void setData();

}
class DaoImpl implements TestDao{
     public void insertRecords(){
         System.out.println("Successfully inserted Data");
     }
     public void setData(){
         System.out.println("Successfully Setting Data");
     }
} 
public class Test{
public static void main(String[] args){
    DaoImpl a = new DaoImpl();
    a.insertRecords();
    a.setData();
}
}