class MyHashSet {

    int bucketSize = 10;
    List<Integer>[] buckets;
    public MyHashSet() {
        buckets = new List[bucketSize];
        for(int i=0;i<bucketSize;i++){
            buckets[i] = new ArrayList<>();
        }
    }
    
    public void add(int key) {
        int index = key%bucketSize;
        if(!buckets[index].contains(key)){
            buckets[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = key%bucketSize;
        buckets[index].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int index = key%bucketSize;
        return buckets[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */