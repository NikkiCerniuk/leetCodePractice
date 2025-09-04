
class Solution {
    public int climbStairs(int n) {
   
  if (n<=2){
    return n;
    }
  
    int oneStepBeforeWays = 2; //represents how many ways the previous step can be reached from a starting point
    int twoStepBeforeWays = 1; //represents how many ways the step before previous can be reached from a starting point
  
    for(int i=3; i<=n; i++){
    int currentNumWays = oneStepBeforeWays + twoStepBeforeWays;
    twoStepBeforeWays = oneStepBeforeWays;
    oneStepBeforeWays = currentNumWays;
    }
      return oneStepBeforeWays; //return this because it is equal to currentNumWays but if we were to return currentNumWays it would be out of scope
   
  
    }
}



/*
 * 
 * time complexity: o(n) becuase we have to iterate through all the steps
 * space complexity: o(1) becuase we do not allocate additional space for this beyond what would be considered constant facro
 */
