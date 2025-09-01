class Solution {
    public int removeDuplicates(int[] nums) {
        

    


int lastUniqueNum = nums[0]; //starting at index zero, track the last unique num value
int lastUniqueNumIndex = 0;  // starting at index zero, track the last unique num position
int k = 1; //starts at one for the first index. symbolizes unique num count

for (int i=0; i<nums.length;i++){ //check for each number until you get to the end of the array 
	if (nums[i] != lastUniqueNum){ //if the value we are currently examining is unique
		nums[lastUniqueNumIndex + 1] = nums[i]; //add to the front of the array infront of the last unique index 
		lastUniqueNumIndex++; // increment lastuniqueindex
        lastUniqueNum = nums[lastUniqueNumIndex]; //updates the last unique num value to the one we jsut addded 
		k++; // increment if we add something
		//could change the old index to something but dont need to for this set of problem requirements and increases overhead 
	
}
}
return k;

    }

}


 /*
  * update: so happy:) This is the first problem were I did not need to ask chat gpt for any help with writing or debugging my code
  */

