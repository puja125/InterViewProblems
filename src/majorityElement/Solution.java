package majorityElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int a:nums)
        {
        	if(map.containsKey(a))
        		map.put(a, map.get(a)+1);
        	else
            map.put(a, 1);
        }
        
        for(Integer m:map.keySet())
        {
        	if(map.get(m)>=n)
        		list.add(m);
        }
        
        return list;
    }

}
