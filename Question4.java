import java.util.Scanner;
import java.util.Stack;

public class Question4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        MyQueue queue = new MyQueue();

        for (int i = 0; i < q; i++) 
        {
            int type = scanner.nextInt();
            if (type == 1) 
            {
                int x = scanner.nextInt();
                queue.enqueue(x);
            } 
                else if (type == 2) 
                {
                queue.dequeue();
                } 
                else if (type == 3) 
                {
                System.out.println(queue.peek());
                }
            }

            scanner.close();
        }
    }
class MyQueue 
{
    private Stack<Integer> lifo = new Stack<>();
    private Stack<Integer> fifo = new Stack<>();

    void enqueue(int x) 
    {
        lifo.push(x);
    }

    void dequeue() 
    {
        if (fifo.isEmpty()) 
        {
            while (!lifo.isEmpty()) 
            {
                fifo.push(lifo.pop());
            }
        }
        if (!fifo.isEmpty()) 
        {
            fifo.pop();
        }
    }

    int peek() 
    {
        if (fifo.isEmpty()) 
        {
            while (!lifo.isEmpty()) 
            {
                fifo.push(lifo.pop());
            }
        }
        return fifo.peek();
    }
}
