class MyHashSet {
    int MAX_SIZE = 10000;
    ChildNode[] set;
    public MyHashSet() {
        set = new ChildNode[MAX_SIZE];
        for(int i = 0; i < MAX_SIZE; i++ ){
            set[i] = new ChildNode(-1);
        }
    }
    
    public void add(int key) {
        ChildNode node= set[key % MAX_SIZE];
        // n1 -> n2 -> n3 -> n4
        while(node.next != null){
            // key check 
            if(node.next.key == key) return;
            node = node.next;
        }
        node.next = new ChildNode(key);

    }
    
    public void remove(int key) {
        ChildNode node = set[key % MAX_SIZE];
        // n1 -> n2 -> n3 -> n4
        // check node present - if true -> disconnect
        while(node.next != null){
            if(node.next.key == key){
                node.next = node.next.next;
            }
        }
        
    }
    
    public boolean contains(int key) {
        ChildNode node = set[key % MAX_SIZE];
        while(node.next != null){
            // key check 
            if(node.next.key == key) return true;
            node = node.next;
        }
        return false;
        
    }
}
class ChildNode {
    int key;
    ChildNode next;
    ChildNode(int key){
        this.key = key;
        this.next = null;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */