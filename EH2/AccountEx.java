class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}
class Account{
    public void withdrawlAmount() throws InsufficientFundsException{
       int amount = 400;
       if(amount <500){
           throw  new InsufficientFundsException("No Money!");
       } 
       else{
           System.out.println("Enjoy");
       } 
    }
    public static void main(String[] args) throws InsufficientFundsException {
        Account a1=new Account();
        a1.withdrawlAmount();
    }
}