class Solution {
    public int strStr(String haystack, String needle) {
        int locationOfSubstring = haystack.indexOf(needle);
        return locationOfSubstring;
    }
}

/*
Time complexity: O(n*m) where:
    - n is for the number of char in the haystack variable
    - m is for the number of char in the needle variable 

Space complexity: O(1) because:
    - inputs dont count as extra space
    - uses a fixed amount of memory, no matter how big the input gets 
*/
