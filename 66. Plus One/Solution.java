class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length - 1;

        for(int i=n; i>= 0;i--){ // traverse from right to left 
            if(digits[i] < 9){
                digits[i] = digits[i]+1; //simply add to the last num in the array if its not 9
                return digits; 
            }else{
                digits[i] = 0; //if its 9, set that value to zero
            }



        }
        //for special instance where the entire number is 9's and we need to make the array one larger
        int[] newNumber = new int[digits.length+1];
        newNumber[0] = 1;
        return newNumber;
        //return this array 
    }
}



/*
 time complexity: O(n) worst case 
    - this is because in the worst case, we would have to examine all the elements in the array once
space complexity: O(n) worst case
    - this is because if a number is all 9's we would have to reallocate a new array
 */
