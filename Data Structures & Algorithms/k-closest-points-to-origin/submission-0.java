class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int[][] ans = new int[k][2];

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(a[2], b[2]));


        for(int i = 0; i < points.length; i++){

            double dist = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);

            pq.add(new double[]{(double)points[i][0], (double)points[i][1], dist});
        
        }

        while(k > 0)
        {
            double temp[] = pq.poll();

            ans[k - 1][0] = (int)temp[0];
            ans[k - 1][1] = (int)temp[1];

            k--;
        }

        return ans;

    }
}
