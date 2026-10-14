public class userImpl 
{
    public static void main(String[] args)
    {

        queue queue = new queue();
        queue.push(5);
        queue.push(10);
        queue.push(15);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
