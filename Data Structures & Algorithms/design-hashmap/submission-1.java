class MyHashMap {
    //Approch 1
    // take array of size max key 10^6
    // use index as key and initilize with -1;
    // use index as key
    int MAX_SIZE = 1000001;
    int[] hashMap;
    public MyHashMap() {
        hashMap = new int[MAX_SIZE];
        for(int i = 0; i < MAX_SIZE;i++){
            hashMap[i] = -1;
        }
        
    }
    
    public void put(int key, int value) {
        hashMap[key]= value;
    }
    
    public int get(int key) {
        return hashMap[key];
    }
    
    public void remove(int key) {
        hashMap[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */