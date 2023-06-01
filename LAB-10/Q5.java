class HrsException extends Exception 
{
    public HrsException() 
    {
        super("Invalid hours entered!");
    }
}
class MinException extends Exception 
{
    public MinException() 
    {
        super("Invalid minutes entered!");
    }
}
class SecException extends Exception 
{
    public SecException() 
    {
        super("Invalid seconds entered!");
    }
}
class Time 
{
    private int hrs, min ,sec;
    public Time(int h, int m, int s) throws HrsException, MinException, SecException 
    {
        if (h < 0 || h > 24) 
        {
            throw new HrsException();
        } 
        else 
        {
            this.hrs = h;
        }
        if (m < 0 || m > 60) 
        {
            throw new MinException();
        } 
        else 
        {
            this.min = m;
        }
        if (s < 0 || s > 60) 
        {
            throw new SecException();
        } 
        else 
        {
            this.sec = s;
        }
    }
    public int getHours() 
    {
        return this.hrs;
    }
    public int getMinutes() 
    {
        return this.min;
    }
    public int getSeconds() 
    {
        return this.sec;
    }
}
public class Q5 
{
    public static void main(String[] args) 
    {
        try 
        {
            Time t = new Time(23, 59, 62);
        } 
        catch (HrsException e) 
        {
            System.out.println(e.getMessage()); 
        } 
        catch (MinException e) 
        {
            System.out.println(e.getMessage()); 
        } 
        catch (SecException e) 
        {
            System.out.println(e.getMessage()); 
        }
    }
}
