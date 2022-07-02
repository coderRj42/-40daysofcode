class Solution {
    public int maxArea(int s, int w, int[] h , int[] v ) {
       
        Arrays.sort(h ); // to get consecutive cuts
        Arrays.sort(v );
        long mod = (long)1e9+7;
        long a = 0,b = 0; // a = max diff of horizontal cuts b = max diff of vertical cuts
        int prev =0; // two edges of cake (0 - first cut)
        a = Math.max(a,h-h[h.length-1]); // and (edge - last cut) of the cake
        b = Math.max(b,w-v[v.length-1]);
        for(int i:h){
            a = Math.max(a,i-prev);
            prev = i;
        }
        prev = 0;
        for(int i:v){
            b = Math.max(b,i-prev);
            prev = i;
        }
        return (int)((a*b)%mod);
    }
}
