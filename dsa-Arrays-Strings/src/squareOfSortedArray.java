public class squareOfSortedArray {
    public static int[]sortedArray(int []a){
        int n= a.length;
        int []result=new int[n];
        int i=0,j=n-1;
        for (int k=n-1;k>=0;k--){
            if(Math.abs(a[i])>Math.abs(a[j])){
                result[k]=a[i]*a[i];
                i++;
            }
            else {
                result[k]=a[j]*a[j];
                j--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int a[]={-4,0,1,3,7,13};
        int []c=sortedArray(a);
        for (int d:c
             ) {
            System.out.print(d+" ");

        }
    }
}
