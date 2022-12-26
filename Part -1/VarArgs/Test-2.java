class Test{
    public static void add(int... arr){
        System.out.println(arr);
    }
    
    
    public static void main(String[] args){
       add();  //[I@45ou4432525
       add(10);//[I@45ou4432523
       add(10,20);//[I@45ou4432525
    }
}