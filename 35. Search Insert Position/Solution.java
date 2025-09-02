class Solution {
    public int searchInsert(int[] nums, int target) {
        

 int midpointIndex =  nums.length / 2;
 int UpperIndex = (nums.length -1);
 int LowerIndex = 0;

while(LowerIndex <= UpperIndex){
    if(nums[midpointIndex] > target){ //target is less than so look at left side of array
        UpperIndex = midpointIndex -1;
    }

    else if(nums[midpointIndex] < target){ //target is greater so look at right side of the array 
        LowerIndex = midpointIndex + 1;
    }

    else if(nums[midpointIndex] == target){
        return midpointIndex; 
    }
    midpointIndex = (UpperIndex+LowerIndex)/2; //update midpoint index 
}
return LowerIndex;

    }
}
/* 
time complexity: O(log (n))
    - because we split the search in half each time 

Space complexity: 
    - O(1) becuase we do not directly count the input in the space complexity. only the algorithm 
    */


 
 
