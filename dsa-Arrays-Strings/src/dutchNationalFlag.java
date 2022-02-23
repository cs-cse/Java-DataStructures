public class dutchNationalFlag {
//    sort array containing only 0's,1's and 2's.

    public static void sort(int []a){
        int i=0;int j=0;
        int k=a.length-1;
        while (i<=k){
            if(a[i]==0){
                swap(a,i,j);
                i++;
                j++;
            }
            else if(a[i]==1){
                i++;
            }
            else if (a[i]==2) {
                swap(a,i,k);
                k--;
            }
      }
        for(int c:a){
            System.out.print(c+" ");
        }
    }
    public static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void main(String[] args) {
        int a[]={1,1,0,2,1,0,2,2,0,1,0,2,0,1};
        sort(a);
    }
}
