package majorityElement;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> l=new HashSet<>();
        for(int a:nums) {
        	if(l.add(a)==false)
        		return true;
        }
        
        return false;
            
    }

}
