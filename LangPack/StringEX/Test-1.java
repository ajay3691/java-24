class Test{
    public static void main(String[] args){
        String name1 = "Rahul";
        name1.concat("Gandhi");
        System.out.println(name1);

        String name2 =new String("Rahul");
        name2.concat("Gandhi");
        System.out.println(name2);
        //Heap memory area
        StringBuffer name3 = new StringBuffer("Rahul");
        name3.append("Gandhi");
        System.out.println(name3);
         //Heap memory area
        StringBuilder name4 = new StringBuilder("Rahul");
        name4.append("Gandhi");
        System.out.println(name4);
        

    }
}