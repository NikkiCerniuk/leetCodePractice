import java.util.ArrayDeque;
//palindrome is something that reads the same forwards and backwards
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)){ //x cannot be negative or end in zero
            return false;
        }

        int reverseHalf =0; //1. declare the reversed half and initalize to zero

        while(x> reverseHalf){
            int lastDigit = x % 10; //get the last digit by doing x mod 10 

            reverseHalf = reverseHalf*10 + lastDigit; //increase the reverse half current by 1 tens place and then and "last Digit" to the ones place
            x = x / 10; //removes the last digit from x
        }
        return (x == reverseHalf || x == reverseHalf/10); 
        //divided by 10 bc we are accounting for an odd number of digits. This removes the middle digit consideration (bc ints truncate after division)

    }
}

