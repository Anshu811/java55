public class myexception2 {
    public static void main(String[] args) {
        Bank b=new Bank();
        try{
            b.withdraw(5000);
            b.withdraw(20000);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
