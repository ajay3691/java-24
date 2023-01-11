class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}
class Account{
    public void withdrawlAmount() throws  InsufficientFundsException{
       int amount = 1400;
       if(amount <500){
           try{
                throw  new InsufficientFundsException("No Money!");
           }
           catch(Exception e){

           }
         
       } 
       else{
           System.out.println("Enjoy");
       } 
   

    }
    public static void main(String[] args){
        Account a1=new Account();
        a1.withdrawlAmount();
    }
}