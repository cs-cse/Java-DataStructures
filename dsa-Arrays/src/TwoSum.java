import java.util.HashMap;

public class TwoSum {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.


        public int[] twoSum(int[] numbers, int target) {
            HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
            for(int i = 0; i < numbers.length; i++){
                Integer requiredNum = (Integer)(target - numbers[i]);
                if(indexMap.containsKey(requiredNum)){
                    int toReturn[] = {indexMap.get(requiredNum), i};
                    return toReturn;
                }

                indexMap.put(numbers[i], i);
            }
            return null;
        }


}
