import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
//    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//    You must implement a solution with a linear runtime complexity and use only constant extra space.


    class Solution {
        public int singleNumber(int[] nums) {
            List<Integer> numsList = new ArrayList<Integer>();
            for(Integer itr : nums){
                if(numsList.contains(itr)){
                    numsList.remove(itr);
                }else{
                    numsList.add(itr);
                }
            }
            return numsList.get(0);
        }
    }
}
