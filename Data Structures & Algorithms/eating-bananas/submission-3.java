class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
       
        Arrays.sort(piles);

        int maxPile = piles[piles.length - 1];

        int max = maxPile, min = 1;
        int ans = max;

        while(min <= max){

            int mid = (min + max) / 2;

            long total = 0;
             for(int i = 0; i < piles.length; i++){

                total += (int)Math.ceil(piles[i] / (mid * 1.0));
             }

             if(total <= (long)h)
             {
                ans = mid;
               max = mid - 1;
               
             }
             else{
                
                min = mid + 1;
             }
        }

        return ans;
       
    }


}
