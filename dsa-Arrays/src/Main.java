public class Main {

    public static void addElement(int []a){
//  method to add elements in an array.
        int n= a.length;
        for(int i=0;i<n;i++){
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

    public static void main(String[] args) {
        int [] myArray=new int[5];
        addElement(myArray);
        showElement(myArray);
        removeEven(myArray);
    }
}
