public class mergeSortedArray {
    public static int[]merge(int []a,int []b){
        int n=a.length;
        int m=b.length;
        int []result=new int[n+m];
        int i=0,j=0,k=0;
        while (i<n && j<m) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }
            while (i<n){
                result[k]=a[i];
                i++;k++;
            }
            while (j<m){
                result[k]=b[j];
                j++;k++;
            }
            return result;
    }
    public static void main(String[] args) {

        int []a={1,3,6,8,9};
        int []b={4,8,9,11,15};
        int []c=merge(a,b);
        for (int d:c) {System.out.print(d+" ");}
        System.out.println();
    }
}
