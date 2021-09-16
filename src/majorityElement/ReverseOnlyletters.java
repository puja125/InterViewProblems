package majorityElement;

public class ReverseOnlyletters {
	 public String reverseOnlyLetters(String s) {
	        char[] chS=s.toCharArray();
	        int i=0;
	        int j=s.length()-1;
	        while(i<j)
	        {
	        	while(i<j&&!Character.isAlphabetic(s.charAt(i)))
	        		i++;
	        	while(j>i&&!Character.isAlphabetic(s.charAt(j)))
	        		j--;
	        	
	        	char temp=s.charAt(i);
	        	chS[i++]=s.charAt(j);
	        	chS[j--]=temp;
	       
	        }
	        
	        return new String(chS);
	        
	    }

}
