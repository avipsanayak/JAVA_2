class LessBalanceException extends Exception 
{
    public LessBalanceException() 
    {
        super("Withdrawal amount is not valid!");
    }
}
public class Q7 
{
    private double bal;
    public Q7() 
    {
        bal = 500;
    }
    public void deposit(double amt) 
    {
        bal += amt;
        System.out.println("Amount deposited:" + amt + "\nNew balance is:" + bal);
    }
    public void withdraw(double amt) throws LessBalanceException 
    {
        if (bal - amt < 500) 
            throw new LessBalanceException();
        else 
        {
            bal -= amt;
            System.out.println("Amount withdrawn:" + amt + "\nNew balance is:" + bal);
        }
    }
    public static void main(String[] args) 
    {
        Q7 a = new Q7();
        a.deposit(1000);
        try 
        {
            a.withdraw(300);
        } 
	  catch (LessBalanceException e) 
        {
            System.out.println(e.getMessage()); 
        }
        try 
        {
            a.withdraw(1000);
        } 
        catch (LessBalanceException e) 
        {
            System.out.println(e.getMessage()); 
        }
    }
}
