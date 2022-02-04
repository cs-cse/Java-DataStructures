import java.util.Stack;
public class ReverseString {
    public static String reverse(String str){
        Stack<Character> stack=new Stack();
        char[]chars=str.toCharArray();
        for(char a:chars){
            stack.push(a);
        }
        for(int i=0;i<str.length();i++){
            chars[i]=stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String a="aabbcc";
        String b=reverse(a);
        System.out.println("Reversed: "+b);

    }
}
