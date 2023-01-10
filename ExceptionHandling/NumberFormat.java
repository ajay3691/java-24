class Test{
    public static void main(String[] args) {
        int i;
        try{
            i = Integer.parseInt("10");
            i = 10/0;
        }
         catch(NumberFormatException nfe){
            i = 200;
        }
        catch(Exception e){
            i = 300;
        }
       

        System.out.println(i);
    }
}