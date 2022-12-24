class Mark{
    public static void main(String[] args){
        cal_Makrs(new int[]{35,36,37,38,39});
    }
    public static void cal_Makrs(int[] marks){
        int total = 0;
        for( int mark:marks){
            //total = total  + mark;
            total  += mark;
        }
        System.out.println(total);
    }
}