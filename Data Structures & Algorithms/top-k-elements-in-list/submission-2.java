class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<String, Integer> map = new HashMap<>();
        
        // PQ stores the keys, but sorts them based on their values in the map
        // (b - a) makes it a Max-Heap (highest value first)
        // PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        Map<Integer,Integer> freqMap = new HashMap<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> freqMap.get(b) - freqMap.get(a) );

        for(int i = 0; i < nums.length; i++){

            if(pq.contains(nums[i])){
                pq.remove(nums[i]);
            }
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
            pq.add(nums[i]);
        }
        int[] result = new int[k];
        int i = 0;
        while(!pq.isEmpty() && k > 0){
            result[i] = pq.poll();
            i++;
            k--;
        }
        return result;

       
    }
}
class Pair{
    int key;
    int value;
    Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
}