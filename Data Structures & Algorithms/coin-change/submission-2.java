class Solution {
    public int coinChange(int[] coins, int amount) {
         Arrays.sort(coins);
        if(amount == 0)
            return 0;

        if( amount < coins[0])
            return -1;
        int[] count = new int[amount + 1];

        for(int i = 0; i < coins.length; i++){

            if(coins[i] <= amount)
            count[coins[i]] = 1;
        }

       

        for(int i = 1; i < amount + 1; i++){
            //System.out.print(i + " ");
            if(count[i] == 0){

                int min = Integer.MAX_VALUE;
                for(int j = 0; j < coins.length; j++){

                    if(coins[j] > i)
                        break;
                    
                    if(count[i - coins[j]] != 0)
                    min = (int)Math.min(min, count[i - coins[j]] + 1);

                    //System.out.print(coins[j] + " " + min);
                }
               
                if(min != Integer.MAX_VALUE)
                   count[i] = min;
            }
             //System.out.println();
        }

        return count[amount] == 0? -1: count[amount];

        
    }
}
