class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length(),max=Integer.MIN_VALUE;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        s='`'+s;  
        int a[]=new int[256];
        int m=0;
        for(int i=1;i<=n;i++)
        {
            char ch=s.charAt(i);
        m=Math.max(m,a[ch]);     
        max=Math.max(max,i-m);  
            a[ch]=i;  
        }
       
        return max;
    }
}
