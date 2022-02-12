public class MaxPriorityQueue {
    Integer []heap;
    int n;

    public MaxPriorityQueue(int capacity) {
        heap=new Integer[capacity+1];
        n=0;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }
    public void insert(int x){
//  method to add an element in a priority queue
        if(n==heap.length-1){
            resize(2*heap.length);
        }
        n++;
        heap[n]=x;
        swim(x);
    }
    public void swim(int k){
        while (k>1 && heap[k/2]<heap[k]){
            int temp=heap[k];
            heap[k]=heap[k/2];
            heap[k/2]=temp;
            k=k/2;
        }
    }
public void resize(int capacity){
//  method to resize the array to increase the capacity of the heap
        Integer[]temp=new Integer[capacity];
        for(int i=0;i<heap.length;i++){
            temp[i]=heap[i];
        }
        heap=temp;


}
    public static void main(String[] args) {
        MaxPriorityQueue pq=new MaxPriorityQueue(3);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());

    }
}
