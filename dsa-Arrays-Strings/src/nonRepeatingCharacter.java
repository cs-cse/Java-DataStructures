import java.util.HashMap;
import java.util.Map;

public class nonRepeatingCharacter {
//    "abcdeabcd"-> ans should be "e"
//    "abab"-> no valid ans
    public static int isValid(String check){
        Map<Character,Integer> map=new HashMap<>();
        char []chars=check.toCharArray();
        for(char ch:chars){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            if(map.get(ch)==1){
                return i;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        String test="hellohibye";
        System.out.println(isValid(test));
    }
}
