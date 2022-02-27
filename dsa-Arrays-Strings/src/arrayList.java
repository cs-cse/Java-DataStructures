import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String>students=new ArrayList<>();
        students.add("Aman");
        students.add("Boat");
        students.add("Emcure");
        students.add(1,"New Boat");
        String c=students.get(2);
        String d=students.set(2,"Hellewwss");
        students.remove(2);
        System.out.println(students.size());
        System.out.println(c);
        System.out.println(d);
        System.out.println( students.contains("a"));
        for(String a: students){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(students);
    }
}
