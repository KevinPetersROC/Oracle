package genericstack;

import java.util.ArrayList;

public class GenericStack<T>
{
    ArrayList<T> items = new ArrayList<T>();
    int top;

    public GenericStack()
    {
        top = 0;
    }

    public void push(T item)
    {
        items.add(item);
        top++;
    }

    public T pop()
    {
        if(isEmpty()) throw new GenericStackException("Underflow Error");
        return items.remove(--top);
    }

    public boolean isEmpty()
    {
        return (top == 0);
    }
}
