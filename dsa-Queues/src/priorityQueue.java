import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(1);
        pq.offer(31);
        pq.offer(22);
        pq.offer(5);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());


    }
}
