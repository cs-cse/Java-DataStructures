import java.util.Set;

public class removeVowels {
    public static String removeVowels(String test){
        Set<Character>vowels= Set.of('a','e','i','o','u');
        StringBuilder sb=new StringBuilder();
        char[]chars=test.toCharArray();
        for(char ch:chars){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        String test="Hellohithi sisSample";
        System.out.println(removeVowels(test));
    }
}
