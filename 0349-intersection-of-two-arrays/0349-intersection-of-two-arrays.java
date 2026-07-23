import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 1. Create a combined array with room for both arrays
        int[] ans_arr = new int[nums1.length + nums2.length]; 
        
        // Copy nums1 into the beginning
        for (int i = 0; i < nums1.length; i++) {
            ans_arr[i] = nums1[i]; 
        } 
        
        // Copy nums2 right AFTER nums1 (Notice the index offset: nums1.length + i)
        for (int i = 0; i < nums2.length; i++) {
            ans_arr[nums1.length + i] = nums2[i]; 
        } 
        
        // 2. Build the frequency map
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int nums : ans_arr) { 
            map.put(nums, map.getOrDefault(nums, 0) + 1); 
        } 
        
        // We use a temporary list to collect keys that fit our criteria
        ArrayList<Integer> matchedKeys = new ArrayList<>();
        
        // 3. To safely read both keys and values, we loop through map entries
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            int key = entry.getKey();
            
            // To be an intersection, the element must exist in BOTH arrays.
            // However, it must also be verified against the separate arrays 
            // to make sure a single array didn't just contain duplicates of it.
            if (val > 1 && containsElement(nums1, key) && containsElement(nums2, key)) {
                matchedKeys.add(key);
            }
        } 
        
        // 4. Convert the collected keys into a primitive int[] array to return
        int[] finalResult = new int[matchedKeys.size()];
        for (int i = 0; i < matchedKeys.size(); i++) {
            finalResult[i] = matchedKeys.get(i);
        }
        
        return finalResult; 
    }

    // Helper method to verify an item actually belongs to an array
    private boolean containsElement(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }
}
