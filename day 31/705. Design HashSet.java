class MyHashSet {
    private ArrayList<Integer> arr = null;
    public MyHashSet() {
        arr = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!arr.contains(key)){
            arr.add(key);
        }
    }
    
    public void remove(int key) {
        if(arr.contains(key)) arr.remove(arr.indexOf(key));
        else return;
    }
    
    public boolean contains(int key) {
        return arr.contains(key);
    }
}
