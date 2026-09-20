class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i < nums.length; i++){

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);

        map.forEach((key, value) ->{
            int temp[] = new int[]{key, value};
             //System.out.println(temp);
            pq.add(temp);
        });

       

        int ans[] = new int[k];
        int cnt0 = 0;
        while(!pq.isEmpty() && cnt0 < k){

            int temp[] = pq.poll();

            ans[cnt0++] = temp[0];
        }

        return ans;
     
    }
}
