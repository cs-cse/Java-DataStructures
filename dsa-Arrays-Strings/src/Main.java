public class Main {

    public static void addElement(int []a){
//  method to add elements in an array.
        int n= a.length;
        for(int i=3;i<n;i++){
            a[i]=i;
        }
        System.out.println("Added !!");
    }
    public static void showElement(int []a){
//  method to show the elements in an array.
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void removeEven(int []a){
//  method to remove even elements in an array.
    int n=a.length;
    int oddNum=0;
    for(int i=0;i<n;i++){
        if(a[i]%2!=0){
            oddNum++;
        }
    }
    int[]newArray=new int[oddNum];
    int j=0;
    for(int i=0;i<n;i++){
       if(a[i]%2!=0){
           newArray[j]=a[i];
           j++;
       }
    }
        System.out.print("New Array: ");
        for (int k:newArray
             ) {
            System.out.print(k+" ");
        }
    }
    public static void revArray(int []a){
//  method to reverse the elements in an array.
        int n=a.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }
    public static void minElement(int[]a){
//  method to find the minimum value element in an array.
    int n=a.length;
    int min=Integer.MAX_VALUE;
    for (int i=0;i<n;i++){
        if(a[i]<min){
            min=a[i];
        }
    }
        System.out.println(min);
    }
    public static void secondMax(int[]a){
//  method to find the second maximum element in an array.
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                secondMax=max;
                max=a[i];
            }
            else if(a[i]>secondMax && a[i]!=max){
                secondMax=a[i];
            }
        }
        System.out.println(secondMax);
    }
    public static void moveZeroToEnd(int a[]){
//  method to move all the zero elements to the end of an array.
        int n=a.length;
        int j=0;
        for (int i=3;i<n;i++){
            if(a[i]!=0&& j==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            if(a[j]!=0){
                j++;
            }
        }
        for (int k:a
             ) {
            System.out.print(k+" ");

        }
        System.out.println();

    }
    public static int [] resize(int []a,int capacity){
//  method to resize an existing array to accommodate more elements.
        int[]temp=new int[capacity];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }

        return temp;

    }
    public static int findMissingNumber(int[]a){
//        important !!
//  method to find the missing number from a given range in an array.
        int n=a.length+1;
        int naturalSum=(n*(n+1))/2;
        for(int ele:a){
            naturalSum=naturalSum-ele;
        }
       return naturalSum;

    }
    public static boolean palindrome(String a){
//  method to check if the String is palindrome or not.
        char[]word=a.toCharArray();
        int end=a.length()-1;
        int start=0;
        while(start<end){
            if(word[start]!=word[end]){
                return false;
            }
            start++;
            end--;
        }



    return true;
    }


    public static void main(String[] args) {
        int [] myArray=new int[15];
        addElement(myArray);
        showElement(myArray);
        moveZeroToEnd(myArray);
        revArray(myArray);
        minElement(myArray);
        secondMax(myArray);
        removeEven(myArray);
        resize(myArray,20);
        int []temp={1,2,3,5};
        System.out.println();
       int check= findMissingNumber(temp);
        System.out.println(check);
        System.out.println(palindrome("madam"));
    }
}
