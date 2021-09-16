package majorityElement;

import java.util.Arrays;

public class TwoSumSorted {

    public int[] twoSum(int[] nums, int target) {
    	//Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int sum=0;
        while(i<j)
        {
        	sum=nums[i]+nums[j];
        	if(sum==target)
        		return new int[] {i,j};
        	else if(sum<target)
        		i++;
        	else
        		j--;
        }
        
        return new int[]{-1,-1};
    }

}
