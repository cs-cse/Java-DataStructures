import java.util.HashMap;

public class TwoSum {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.

    public static int[] twoSum(int []a,int target){

        int start=0;
        int end=a.length-1;
        while (start<end){
            if(a[start]+a[end]==target){
                return new int[]{start,end};
            }else if(a[start]+a[end]<target){
                start++;
            }
            else {
                end--;
            }
        }

        return null;

    }
    public static int [] twoSum2(int []a,int target){

        HashMap<Integer,Integer> map=new HashMap<>();
        int[]result=new int[2];
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(target-a[i])){
                map.put(a[i],i);
            }
            else{
                result[1]=i;
                result[0]=map.get(target-a[i]);
                return result;
            }

        }
        return null;

    }



    public static void main(String[] args) {
        int []a={1,2,3,6,8,-1,9};

        int []c=twoSum(a,0);

        for(int d:c){
            System.out.print(d+" ");
        }
        System.out.println();
        System.out.println("**********************");

        int []c2=twoSum2(a,0);

        for(int d:c2){
            System.out.print(d+" ");
        }


    }





























}
