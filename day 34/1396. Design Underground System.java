class UndergroundSystem {
    public static class pair{
        String city;
        int time;
        int count = 0;
        public pair(String city, int time){
            this.city = city;
            this.time = time;
        }
    }
	
    HashMap<Integer,pair> src;//id-> src and time
    HashMap<HashMap<String,String>,pair> avg;//src to destn will be key with time and count
	
    public UndergroundSystem() {
        src = new HashMap<>();
        avg = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        src.put(id, new pair(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        pair Start = src.get(id);
        HashMap<String,String> src_to_destn = new HashMap<>();
        src_to_destn.put(Start.city, stationName);
        
        if(avg.containsKey(src_to_destn)){
            pair destn = avg.get(src_to_destn);
            destn.count++;
            destn.time += t - Start.time;
            avg.put(src_to_destn, destn);
        }else{
            pair destn = new pair(stationName, t - Start.time);
            destn.count++;
            avg.put(src_to_destn, destn);
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        HashMap<String,String> src_to_destn = new HashMap<>();
        src_to_destn.put(startStation, endStation);
        
        pair ans = avg.get(src_to_destn);
        int count =ans.count;
        int time = ans.time;
        double res = (time * 1.0) / (count * 1.0);
        return res;
    }
}
