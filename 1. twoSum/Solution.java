//passed 
class Solution {
    public int[] twoSum(int[] nums, int target) {
            //error handling: if there are not 2 elements in the array then error statement "array has less than 2 elements"
        assert nums.length >= 2 : "Array must have at least 2 elements";


     //   1. create a hashmap
     Map<Integer, Integer> myMap = new HashMap<>();
     // 2. iterate through the entire parameter array
     for (int i=0; i<nums.length; i++){
        //3. calculate the complement 
        int compliment = target-nums[i];
        if(myMap.containsKey(compliment)){ //4. check if the compliment already exists in the hashmap 
            return new int[]{myMap.get(compliment), i};
        }
        //5. if it does not exist, add the number to the map
        myMap.put(nums[i], i); //the number at index is the key and the index itself is the value
     }
//throws exception if we cannot sum to the target w two numbers in the array 
throw new IllegalArgumentException("No two sum solutions exist");

    }
}


/*
Time Complexity: 


Space Complexity: 

*/
