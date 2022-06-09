public class stringRotationofstringGFG {
    public static void main(String[] args) {
        String a="abcd";
        String b="baccd";
        if(isRotated(a,b)){
            System.out.println("Rotation of each other !!");
        }
        else{
            System.out.println("Not rotation of each other :( ");
        }
    }
    public static boolean isRotated(String a,String b){
        boolean isRotation=false;
        if(a==null || b==null){
            return false;
        }
        else if(a.length()==0 || b.length()==0){
            return false;
        }
        String concat=a+a;
        if(concat.contains(b)){
            isRotation=true;
        }
        return isRotation;
    }
}
