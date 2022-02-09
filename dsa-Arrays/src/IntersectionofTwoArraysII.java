import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArraysII {
//    Given two integer arrays nums1 and nums2, return an array of their intersection.
//    Each element in the result must appear as many times as it shows in both arrays and
//    you may return the result in any order.

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0;
        int j =0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i < nums1.length  && j< nums2.length)
        {
            if(nums1[i] == nums2[j])
            {   ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
            {
                i++;
            }
            else if(nums1[i] > nums2[j])
            {
                j++;
            }
        }
        int idx =0;
        int[] res = new int[ans.size()];
        for(Integer t : ans)
        {
            res[idx++] = t;
        }
        return res;
    }

}
