public class reverseInteger {
    public static int reverse(int x){
        long reverseNum=0;
       while(x!=0){
           int last_digit=x/10;
        reverseNum=reverseNum*10+last_digit;
           x=x/10;
       }
       return (int)reverseNum;

    }
    public static void main(String[] args) {
        System.out.println(  reverse(1231001));
    }
}