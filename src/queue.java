public class queue
{
    Node first;
    Node last;
    int count = 0;
    public void push(Object ele)
    {
        Node n = new Node(ele);
        if(first == null)
        {
            first = n;
            count++;
            return;
        }
        n.next = last;
        last = n;
        count++;
    }
    public int size()
    {
        return count;
    }
    public boolean isEmpty()
    {
        return count==0;
    }
    public Object peek()
    {
        return first.ele;
    }
    public Object poll()
    {
        Object key = first.ele;
        first = first.next;
        count--;
        return key;
    }
}
