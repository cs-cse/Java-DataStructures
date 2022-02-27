import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<String,Integer>numbers=new HashMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        System.out.println(numbers);
        System.out.println("Entries: ");
        for (Map.Entry<String,Integer>e:numbers.entrySet()){
            System.out.print(e+" ");
        }
        System.out.println();

        System.out.println("Keys: ");
        for (Map.Entry<String,Integer>e:numbers.entrySet()){
            System.out.print(e.getKey()+" ");
        }
        System.out.println();
        System.out.println("Values: ");
        for (Map.Entry<String,Integer>e:numbers.entrySet()){
            System.out.print(e.getValue()+" ");
        }
    }
}
