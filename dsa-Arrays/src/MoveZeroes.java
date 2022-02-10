public class MoveZeroes {
//    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//    Note that you must do this in-place without making a copy of the array.
public static int [] moveZeroes(int[] nums) {
    int n=nums.length;
    int start=0;
    int end=0;
    while(start<n){
        if(nums[start]==0){
            ++start;
        }else{
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end++;
        }

    }
return nums;
}

    public static void main(String[] args) {
        int []nums ={0,1,0,3,12};
        int []c=moveZeroes(nums);
        for(int d:c){
            System.out.print(d+" ");
        }
    }
}
