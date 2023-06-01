//Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement.
class Q1
{
    public static void main(String[] args)
    {
        int a[]= new int[10];
        try
        {
            a[11]= 12;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}