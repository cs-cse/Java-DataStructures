import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSet {
    public static void main(String[] args) {

        Set<Integer>set=new HashSet<>();
        set.add(23);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(2);
        set.remove(2);
        System.out.println(set);
        System.out.println( set.contains(1));
        System.out.println(set.size());
        System.out.println("*** *** *** *** *** *** *** *** *** ***");
        Set<Integer>setl=new LinkedHashSet<>();
        setl.add(23);
        setl.add(1);
        setl.add(2);
        setl.add(5);
        setl.add(2);
        setl.remove(2);
        System.out.println(setl);
        System.out.println( setl.contains(1));
        System.out.println(setl.size());
        System.out.println("*** *** *** *** *** *** *** *** *** ***");
        Set<Integer>setree=new TreeSet<>();
        setree.add(23);
        setree.add(1);
        setree.add(2);
        setree.add(5);
        setree.add(2);
        setree.remove(2);
        System.out.println(setree);
        System.out.println( setree.contains(1));
        System.out.println(setree.size());

    }
}
