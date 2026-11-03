class LRUCache {

    LinkedHashMap<Integer, Integer> lhm;
    int cap;
    public LRUCache(int capacity) {
        lhm = new LinkedHashMap<>();
        cap = capacity;
    }
    
    public int get(int key) {

        if(lhm.containsKey(key))
        {
            int val = lhm.get(key);
            lhm.remove(key);
            lhm.put(key, val);

            return val;
        }

        return -1;   
    }
    
    public void put(int key, int value) {
        
       
           
         if(lhm.containsKey(key))
        {
           
            lhm.remove(key);
           

        
        }

         lhm.put(key, value);

        
        if(lhm.size() > cap){
            lhm.pollFirstEntry();
        }
    }
}
