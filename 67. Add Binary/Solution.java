class Solution {
    public String addBinary(String a, String b) {
        StringBuilder abMutableString = new StringBuilder();
        int i = a.length()-1, j = b.length()-1, carry =0;

        while( i>= 0 || j >= 0 || carry > 0){
            int sum = carry;

            if (i >=0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }

            abMutableString.append(sum % 2); //append the current bit (not the carry over)
            carry = sum/2; //updates the carry for the next value we look at while shifting left
        }
        return abMutableString.reverse().toString(); //reverse becuase we added the values right to left
    }
}


/*
 
 Time Complexity: 
    - O(n) because in worst case (and in all cases) you will have to go through each array of a and b. its not 2 n because we ignore constant factors with big o
    
 Space Complexity: 
    - O(n) becuase we have to create another string based on the combined input sizes and that requires space. StringBuilder

 
 
 */
