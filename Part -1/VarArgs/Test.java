class Test{
    public static void add(int[] arr){
        int sum=0;
        for(int value:arr){
            sum = sum+value;
        }
        System.out.println(sum);
    }
    
    
    public static void main(String[] args){
       add();  //0
       add(10);//10
       add(10,20);//30    
    }
}