public class validSubsequence {
//  A subsequence of a string is a new string formed by original string
//  by deleting some or no characters without changing the order of remaining characters.
//    Ex: "ace"->"abcde" (valid)
//        "aec"->"abcde" (invalid)

        public static boolean isValid(String test,String check){
            int a=0;
            int b=0;
            while(a<test.length() && b<check.length()){
                if(test.charAt(a)==check.charAt(b)){
                    b++;
                }
                a++;

            }
            return b==check.length();
        }

    public static void main(String[] args) {
            String test="abcde";
        System.out.println(isValid(test,"acd"));
    }
}
