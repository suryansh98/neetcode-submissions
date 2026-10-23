class Solution {
    public int longestConsecutive(int[] nums) {

     int longest = 0; 
     HashSet<Integer> hs = new HashSet<>();
    for(int i = 0; i < nums.length; i++){

        hs.add(nums[i]);

    }

    for(int i = 0; i < nums.length; i++){

        if(!hs.contains(nums[i] - 1)){

            int temp = 1; 
            int prev = nums[i];
            while(hs.contains(prev + 1)){
                temp++;
                prev++;
            }

            if(longest < temp){
                longest = temp;
            }
        }
    }

    return longest; 
     
    }
}
