import java.util.Arrays;

public class threeSum {
    public static void threeSum(int []a,int target){
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            int j=i+1;
            int k=a.length-1;
            while(j<k){
                int sum=a[i]+a[j]+a[k];
                if(sum==target){
                    System.out.println(i+" "+j+" "+k);
                    j++;
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else {
                    k--;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6};
        threeSum(a,10);
    }
}
