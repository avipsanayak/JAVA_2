class StackFullException extends Exception 
{
    public StackFullException() 
    {
        super("Stack is full!");
    }
}
class StackEmptyException extends Exception 
{
    public StackEmptyException() 
    {
        super("Stack is empty!");
    }
}
class Stack 
{
    private int[] arr;
    private int top, max;
    public Stack(int size) 
    {
        arr = new int[size];
        max = size;
        top = -1;
    }
    public void push(int val) throws StackFullException 
    {
        if (top == max - 1)
            throw new StackFullException(); 
        else
            arr[++top] = val;
    }
    public int pop() throws StackEmptyException 
    {
        if (top == -1)
            throw new StackEmptyException(); 
        else
            return arr[top--];
    }
}
public class Q8 
{
    public static void main(String[] args) 
    {
        Stack s = new Stack(4);
        try 
        {
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
        } 
        catch (StackFullException e) 
        {
            System.out.println(e.getMessage()); 
        }
        try 
        {
            while (true) 
                System.out.println(s.pop());
        } 
        catch (StackEmptyException e) 
        {
            System.out.println(e.getMessage()); 
        }
    }
}
