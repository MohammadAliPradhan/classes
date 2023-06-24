package Queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args)
    {
        Queue<Integer>queue= new LinkedList<>();

        queue.add(15);  //enqueue;
        queue.add(3);
        queue.add(19);
        queue.add(7);
        queue.add(5);

        System.out.print(queue.remove());//deque;
        System.out.print(queue.peek());//; this would give the first element
        System.out.print(queue.isEmpty());//;
        System.out.print(queue);//;
        Iterator it=queue.iterator();
        while(it.hasNext()){


        }


//


    }
}
