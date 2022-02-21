public class HashTable {
    private HashNode[]buckets;
    private int numOfBuckets;
    private int size;
    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(int capacity) {
        this.buckets = new HashNode[capacity];
        this.numOfBuckets = capacity;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public void put(Integer key,String value){
        if(key==null || value==null){
            throw new IllegalArgumentException("Null value detected");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        while (head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        size++;
        head=buckets[bucketIndex];
        HashNode node=new HashNode(key, value);
        node.next=head;
        buckets[bucketIndex]=head;

    }
    public String get(Integer key){
        if(key==null){
            throw new IllegalArgumentException("Null value detected");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        while (head!=null){
            if (head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    public String remove(Integer key){
        return null;
    }

    public int getBucketIndex(int key){
        return key%numOfBuckets;
    }

    public static void main(String[] args) {
        HashTable ht=new HashTable(10);
        ht.put(1,"Hello");
        System.out.println(ht.size());
        System.out.println(ht.get(1));
    }
}
