class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for(int i : stones){
            pq.add(i);
        }

        while(!pq.isEmpty() && pq.size() > 1)
        {
            int x = pq.poll();
            int y = pq.poll();

            if(x == y)
                continue;
            int left = (int)Math.abs(x - y);

            pq.add(left);
        }

        return pq.isEmpty()? 0: pq.poll();
        
    }
}
