class Solution {
    public boolean canJump(int[] nums) {
        

        int goal = nums.length - 1, n = nums.length;

        if(n == 1)
            return true;
        if(nums[0] == 0)
            return false;
        for(int i = n -2; i >=0; i--){
            
            if(i + nums[i] >= goal)
                goal = i;

           // cnt++;

           
        }

        return goal == 0;
    }
}
