import java.util.Arrays;

public class ContainsDuplicate {
//    Given an integer array nums, return true if any value appears at least twice in the array,
//    and return false if every element is distinct.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }

        return false;
    }
}
}
