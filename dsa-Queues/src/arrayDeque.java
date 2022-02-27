import java.util.ArrayDeque;

public class arrayDeque {
//    pronounced as 'deck'
public static void main(String[] args) {
    ArrayDeque<Integer>adq=new ArrayDeque<>();
    adq.offer(3);
    adq.offerFirst(13);
    adq.offerLast(23);
    System.out.println(adq);

    adq.pollFirst();
    adq.pollLast();
    System.out.println(adq);
}
}
