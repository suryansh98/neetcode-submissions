class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        //max-hep for frequency of each letter 
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int[] cnt = new int[26];

        for(int i = 0; i < tasks.length; i++)
        {
            char c = tasks[i];

            cnt[c - 65]++;
        }

        for(int i= 0; i < 26; i++)
        {   
            if(cnt[i] > 0)
            pq.add(cnt[i]);
            
        }


        int cycle = 0;

        Queue<int[]> coolQ = new LinkedList<>();

        while(!pq.isEmpty() || !coolQ.isEmpty()){
            cycle++;

            if(!coolQ.isEmpty() && coolQ.peek()[1] == cycle)
            {
                pq.add(coolQ.poll()[0]);
            }

            if(!pq.isEmpty()){

                int freq = pq.poll();

                if(freq > 1)
                {
                    coolQ.add(new int[]{freq - 1, cycle + n + 1});
                }
            }

            
        }

        return cycle;

    }
}
