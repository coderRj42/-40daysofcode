class Solution {
     public boolean isAnagram(String s, String t) {
        int[] m = new int[26];
        boolean res = true;
        if(s.length()!=t.length())return false;
        for(char c:s.toCharArray()){
            int preIndex = m[c-'a'];
            int index = t.indexOf(c,preIndex);
            if(index==-1)return false;
            m[c-'a']=index+1;
        }
        return res;
    }

}
