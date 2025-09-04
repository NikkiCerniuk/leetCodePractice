class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (nums2 == null) {
            return; // num1 array is already correct in this instance
        }

for(int i = 0; i<num2.length;i++){ //runs O(n) times 
    nums1[m+i] = nums2[i]; // adds num2 to the blank spaces //has O(n) time complexity
}
Arrays.sort(nums1); (insertion sort then merge sort)
    }

}


/*
 * time complexity: 
 * - array.sort functions via insertion sort and merge sort combined. We By insertion sort on small chunks. This means that the merge sort dominates the time complexity. 
 * 
 * 
 * - merge sort is always time complexity of O(n(log n)) in best, worst, and average cases
 *              - O(log n) comes from the splitting of elements
 *              - O(n) comes from the merging of elements
 * 
 * 
 * - sub in (m+n) for n in O(n(log(n))) where m+n stands for the final array after you have copied over n elements 
 * 
 * 
 * space complexity: 
 * - space complexity is O(1)becuase we do not allocate additional space beyond constants and what is supplied in the input 
 * 

   *  technially O(n(log(n)) and O(m+n)(log(m+n)) aresaying the same thing just one is more specific 
  and tells us there might be other things are happening in the probelm like adding 2 arrays together 
  which may take more time. However, their time complexity graphs would be plotted the same 
  */
 */





 * 
 * 
 * 
