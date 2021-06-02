package com.cloud.core;

/*Create an array count[] to store counts of characters.
Traverse the input string str and do following for every character x = str[i]. 
Increment count[x].
Traverse the input string again and do following for every character str[i]
If count[x] is 1, then print the unique character
If count[x] is greater than 1, then ignore the repeated character.

*/
public class RemoveOccurenceOfChar {

static final int NO_OF_CHARS = 256;
    
    /* Print duplicates present in the passed string */
    static void printDistinct(String str)
    {
        // Create an array of size 256 and count of
        // every character in it
        int[] count = new int[NO_OF_CHARS];
      
        /* Count array with frequency of characters */
        int i;
        for (i = 0; i < str.length(); i++)
            if(str.charAt(i)!=' ')
                count[(int)str.charAt(i)]++;
        int n = i;
      
        // Print characters having count more than 0
        for (i = 0; i < n; i++)
            if (count[(int)str.charAt(i)] == 1)
                System.out.print(str.charAt(i));
    }
	
	
	public static void main(String[] args) {
		String str = "AkshayAkash";
        printDistinct(str);
		
	}
	

}
