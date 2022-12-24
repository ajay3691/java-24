class Enames{
     public static void main(String[] args){
     
     String[] enames = {"Ashok","Puneethi","Sreenu","Nithish","Sagar"};
     System.out.println(enames.length);  //5
     
     String name = "Rahul Gandhi Judo";
     System.out.println(name.length());  //17
      
     for(String ename:enames){
         System.out.println(ename);
     }
    }
}