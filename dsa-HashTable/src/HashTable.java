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
        if(key==null){
            throw new IllegalArgumentException("Null value detected !!");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        HashNode previous=null;
        while(head!=null){
            if(head.key.equals(key)){
                break;
            }
            previous=head;
            head=head.next;
        }
        if(head==null){
            return null;
        }
        size--;
        if(previous!=null){
            previous.next=head.next;
        }
        else{
            buckets[bucketIndex]=head.next;
        }
        return head.value;
    }

    public int getBucketIndex(int key){
        return key%numOfBuckets;
    }

    public static void main(String[] args) {
        HashTable ht=new HashTable(10);
        ht.put(1,"Hello");
        ht.put(2,"Hii");
        ht.put(3,"Bye");
        ht.put(4,"Byeeee");
        System.out.println(ht.get(1));
        System.out.println(ht.remove(1));
    }
}
