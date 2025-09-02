class Solution {
    public int lengthOfLastWord(String s) {
            int i = s.length() - 1;
            int lastWordLength = 0;
            
            while(i >= 0 && s.charAt(i) == ' '){//skips the trailing white space
                i--;
            }

            
            while(i>=0 && s.charAt(i) != ' '){//while there is a character in the index we are looking at
            i--;
            lastWordLength++;
            }

            return lastWordLength;
        }
    };



/*
 * time complexity is o(n) because its depedent on the length of the string (at least any trailing white space and the last word )
 * space complexity is o(1) because the auxillary space allocations are constant and do not change depending on teh size of the input 
    /*
  
