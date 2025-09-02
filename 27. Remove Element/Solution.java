class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;// k is the number of elements we will return 
        int lastOpenSpot = 0; //declare last nonval index
        for (int i=0;i < nums.length; i++){ //traverse the entire length of the array
            if (nums[i] != val){
                nums[lastOpenSpot] = nums[i]; //add this value to the next open index 
                lastOpenSpot++;
                k++; //found non-val so add to count 
                
            }

        }
        return k;
    }
}
