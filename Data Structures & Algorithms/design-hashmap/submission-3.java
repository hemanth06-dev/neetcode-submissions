class MyHashMap {
    //Approch 1
    // take array of size max key 10^6
    // use index as key and initilize with -1;
    // use index as key
    // int MAX_SIZE = 1000001;
    // int[] hashMap;
    // public MyHashMap() {
    //     hashMap = new int[MAX_SIZE];
    //     for(int i = 0; i < MAX_SIZE;i++){
    //         hashMap[i] = -1;
    //     }
        
    // }
    
    // public void put(int key, int value) {
    //     hashMap[key]= value;
    // }
    
    // public int get(int key) {
    //     return hashMap[key];
    // }
    
    // public void remove(int key) {
    //     hashMap[key] = -1;
    // }

    //--------------
    // Approch 2
    int MAX_SIZE = 1000;
    Node[] hashMap;
    public MyHashMap() {
        hashMap = new Node[MAX_SIZE];
        for(int i = 0; i < MAX_SIZE; i++){
            hashMap[i] = new Node(-1,-1);
        }
    }
    int hash(int key){
        return key % MAX_SIZE;
    }
    
    public void put(int key, int value) {
       Node node= hashMap[hash(key)];
       while(node.next != null){
            if(node.next.key == key){
                node.next.value = value;
                return;
            }
            node = node.next;
       }
       if(node.next == null){
        node.next = new Node(key,value);
       }
    }
    
    public int get(int key) {
       Node node = hashMap[hash(key)];
       while(node.next != null){
        if(node.next.key == key)
            return node.next.value;
        node = node.next;
       }
       return -1;
    }
    
    public void remove(int key) {
        Node node = hashMap[hash(key)];
        System.out.println("key: "+key);
        System.out.println("check : "+ (node == null));
        System.out.println("ndoe ;"+node.next);
        while(node.next != null){
            if(node.next.key == key){
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }
    }
}
class Node {
    int key;
    int value;
    Node next;
    Node(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */