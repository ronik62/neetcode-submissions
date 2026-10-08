class MyHashMap {

    List<Node>[] buckets;
    int bucketSize = 10;

    public MyHashMap() {
        buckets = new List[bucketSize];
        for(int i=0;i<bucketSize;i++){
            buckets[i] = new ArrayList<>();
        }
    }
    
    public void put(int key, int value) {
        int index = key%bucketSize;
        for(Node node:buckets[index]){
            if(node.key==key){
                node.value=value;
                return;
            }
        }
        buckets[index].add(new Node(key,value));
    }
    
    public int get(int key) {
        int index = key%bucketSize;
        for(Node node:buckets[index]){
            if(node.key==key){
                return node.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = key%bucketSize;
        for(int i=0;i<buckets[index].size();i++){
            if(buckets[index].get(i).key==key){
                buckets[index].remove(i);
            }
        }
    }
}
class Node{
    int key;
    int value;
    Node(int key,int value){
        this.key = key;
        this.value = value;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */