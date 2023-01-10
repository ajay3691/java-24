public class Test{
    public static void main(String[] args){
      
        try{
          
            System.out.println(10/0);
        }
        
        catch(ArithmeticException e){
            System.out.println("Cant Devide by Zero");
        }
        catch(Exception e){
            System.out.println(10/4);
        }
        System.out.println("GN");
    }
}